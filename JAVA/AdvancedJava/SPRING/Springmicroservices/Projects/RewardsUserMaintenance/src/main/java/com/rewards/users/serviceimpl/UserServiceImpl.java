package com.rewards.users.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rewards.users.entities.User;
import com.rewards.users.repositories.UserRepository;
import com.rewards.users.service.UserMaintenanceClient;
import com.rewards.users.service.UserService;

import feign.FeignException;

/*
– UserDetailsService interface has a method to load User by username and returns a UserDetails object that Spring Security can use for authentication and validation.

– UserDetails contains necessary information (such as: username, password, authorities) to build an Authentication object.*/
@Service("userService")
	public class UserServiceImpl implements UserService {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	 
	 @Autowired
	 private UserRepository userRepository;
	 
	 @Autowired
	 private UserMaintenanceClient userMaintenanceClient ;
	 
	
	  @Autowired
	  private RestTemplate restTemplate;
	 
	 

	 public User findUserByEmail(String email) {
	  return userRepository.findByEmail(email);
	 }

	 @Override
		@Transactional
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			User user = userRepository.findByUsername(username)
					.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

			return UserDetailsImpl.build(user);
		}

	 public void communicationusingresttemplate() {
		 
		 String theUrl ="http://rewardsuseraccountmanagement/account/checkaccess";
		 
		 ResponseEntity<String> response = restTemplate.exchange(theUrl, HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
			});
			String a = response.getBody();
			System.out.println(a);
			
	 }
	 
	 public void commUsingFeigclient() {
		 
		 try {
			logger.info("before maintenance client call");
			 String a =userMaintenanceClient.getAllaccess();
			 logger.info("after maintenance client call");
		} catch (FeignException e) {
			logger.error(e.getLocalizedMessage());
		}
		 
	 }

	
	 


	 


	


}
