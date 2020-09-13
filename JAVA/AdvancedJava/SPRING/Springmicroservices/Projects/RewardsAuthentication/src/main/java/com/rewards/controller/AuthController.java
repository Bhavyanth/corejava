package com.rewards.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rewards.config.JwtUtils;
import com.rewards.entities.Role;
import com.rewards.entities.User;
import com.rewards.repositories.RoleRepository;
import com.rewards.repositories.UserRepository;
import com.rewards.request.LoginRequest;
import com.rewards.request.SignupRequest;
import com.rewards.response.JwtResponse;
import com.rewards.response.MessageResponse;
import com.rewards.serviceimpl.UserDetailsImpl;
import com.rewards.utils.ConfigProperties;


/*Controller receives and handles request after it was filtered by OncePerRequestFilter.*/

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {
	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Autowired
	PasswordEncoder encoder;

	@Autowired
	JwtUtils jwtUtils;
	
	@Autowired
	ConfigProperties configProp;

	@PostMapping("/signin")
	//@Valid is used to validate the values inthe body
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

		/*
		 *  UsernamePasswordAuthenticationToken gets {username, password} from login Request, AuthenticationManager will use
		 * it to authenticate a login account.
		 */
		/*
		 * AuthenticationManager has a DaoAuthenticationProvider (with help of
		 * UserDetailsService & PasswordEncoder) to validate
		 * UsernamePasswordAuthenticationToken object. If successful,
		 * AuthenticationManager returns a fully populated Authentication object
		 * (including granted authorities).
		 */
		/*
		 * If the authentication process is successful, we can get User’s information
		 * such as username, password, authorities from an Authentication object.
		 */
		/*
		 * If we want to get more data (id, email…), we can create an implementation of
		 * this UserDetails interface. like UserDetailsImpl
		 */
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUserName(), loginRequest.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);
		String jwt = jwtUtils.generateJwtToken(authentication);
		
		UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();		
		List<String> roles = userDetails.getAuthorities().stream()
				.map(item -> item.getAuthority())
				.collect(Collectors.toList());

		return ResponseEntity.ok(new JwtResponse(jwt, 
												 userDetails.getId(), 
												 userDetails.getUsername(), 
												 userDetails.getEmail(), 
												 roles));
	}

	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
		if (userRepository.existsByUsername(signUpRequest.getUserName())) {
			return ResponseEntity
					.badRequest()
					.body(new MessageResponse( configProp.getConfigValue("auth.user.name.taken") ));
		}

		if (userRepository.existsByEmail(signUpRequest.getEmail())) {
			return ResponseEntity
					.badRequest()
					.body(new MessageResponse( configProp.getConfigValue("auth.user.email.taken") ));
		}

		// Create new user's account
		User user = new User(signUpRequest.getUserName(), 
							 signUpRequest.getEmail(),
							 encoder.encode(signUpRequest.getPassword()));

		Set<String> strRoles = signUpRequest.getRole();
		Set<Role> roles = new HashSet<>();

		/**if (strRoles == null) {
			Role userRole = roleRepository.findByRole(ERole.ROLE_USER.toString())
					.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
			roles.add(userRole);
		} else {
			strRoles.forEach(role -> {
				switch (role) {
				case "admin":
					Role adminRole = roleRepository.findByRole(ERole.ROLE_ADMIN.toString())
							.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
					roles.add(adminRole);

					break;
				case "mod":
					Role modRole = roleRepository.findByRole(ERole.ROLE_MODERATOR.toString())
							.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
					roles.add(modRole);

					break;
				default:
					Role userRole = roleRepository.findByRole(ERole.ROLE_USER.toString())
							.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
					roles.add(userRole);
				}
			});
		}**/

		user.setRoles(roles);
		userRepository.save(user);

		return ResponseEntity.ok(new MessageResponse( configProp.getConfigValue("auth.user.register.success")));
	}

}


/* https://bezkoder.com/spring-boot-jwt-authentication/ */