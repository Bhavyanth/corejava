package com.rewards.config;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.rewards.serviceimpl.UserServiceImpl;

/*The @EnableWebSecurity annotation and WebSecurityConfigurerAdapter work together to provide web based security. By extending WebSecurityConfigurerAdapter and only a few lines of code we are able to do the following:

Require the user to be authenticated prior to accessing any URL within our application
Create a user with the username “user”, password “password”, and role of “ROLE_USER”
Enables HTTP Basic and Form based authentication
Spring Security will automatically render a login page and logout success page for you

this will provide default  configuration if we need to customize our security we need to implement configure mehtod*/


/*If you define a @Configuration with @EnableWebSecurity anywhere in your application it will switch off the default webapp security settings in Spring Boot */
/*@EnableWebSecurity allows Spring to find and automatically apply the class to the global Web Security.*/
/*– @EnableGlobalMethodSecurity provides AOP security on methods. It enables @PreAuthorize, @PostAuthorize, it also supports JSR-250. You can find more
 *  parameters in configuration in Method Security Expressions.*/
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Autowired
	UserServiceImpl userDetailsService;

	@Autowired
	private AuthEntryPointJwt unauthorizedHandler;

	@Bean
	public AuthTokenFilter authenticationJwtTokenFilter() {
		return new AuthTokenFilter();
	}

	@Override
	public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
		authenticationManagerBuilder.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}

	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	/* If we don’t specify, it will use plain text. */
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	/*
	 * We override the configure(HttpSecurity http) method from
	 * WebSecurityConfigurerAdapter interface. It tells Spring Security how we
	 * configure CORS and CSRF, when we want to require all users to be
	 * authenticated or not, which filter (AuthTokenFilter) and when we want it to
	 * work (filter before UsernamePasswordAuthenticationFilter), which Exception
	 * Handler is chosen (AuthEntryPointJwt).
	 */
	/*
	 * It allows configuring web based security for specific http requests. By
	 * default it will be applied to all requests, but can be restricted using
	 * requestMatcher(RequestMatcher) or other similar methods.
	 */
	
	/* check below url for Sessions 
	 * https://www.baeldung.com/spring-security-session
	 */	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors().and().csrf().disable()
			.exceptionHandling().authenticationEntryPoint(unauthorizedHandler).and()
			.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
			.authorizeRequests().antMatchers("/api/auth/**").permitAll()
				/* .antMatchers("/api/test/**").permitAll() */
			.anyRequest().authenticated();

		http.addFilterBefore(authenticationJwtTokenFilter(), UsernamePasswordAuthenticationFilter.class);
	}}
