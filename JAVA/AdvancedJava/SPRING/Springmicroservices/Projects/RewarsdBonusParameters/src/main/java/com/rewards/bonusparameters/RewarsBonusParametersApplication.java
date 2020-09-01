package com.rewards.bonusparameters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.rewards.bonusparameters.controller"})
@EnableEurekaClient
@EnableFeignClients
public class RewarsBonusParametersApplication {

	public static void main(String[] args) {
		SpringApplication.run(RewarsBonusParametersApplication.class, args);
	}

}
