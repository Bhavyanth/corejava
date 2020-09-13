package com.rewards.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.client.RestTemplate;

import com.rewards.users.utils.FeignErrorDecoder;

import feign.Logger;

@SpringBootApplication(scanBasePackages = {"com.rewards.users.security",
		"com.rewards.users.controller" ,
		"com.rewards.users.service" ,
		"com.rewards.users.serviceimpl" ,
		"com.rewards.users.repositories",
		"com.rewards.users.config",
		"com.rewards.users.utils",
		"com.rewards.users.entities",
		"com.rewards.users.models"})
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
public class RewardsUserMaintenanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RewardsUserMaintenanceApplication.class, args);
	}

	/* If we don’t specify, it will use plain text. */
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate getrestTemplate() {
		return new RestTemplate();
		
	}
	
	@Bean
	public Logger.Level feignlogger() {
		return Logger.Level.FULL;
		
	}
	
	@Bean
	public FeignErrorDecoder feignerrordecoder() {
		
		return new FeignErrorDecoder();
	}
}
