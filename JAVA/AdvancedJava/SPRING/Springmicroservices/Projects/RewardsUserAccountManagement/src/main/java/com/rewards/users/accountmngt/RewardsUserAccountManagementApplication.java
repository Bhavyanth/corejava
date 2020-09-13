package com.rewards.users.accountmngt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RewardsUserAccountManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(RewardsUserAccountManagementApplication.class, args);
	}

}
