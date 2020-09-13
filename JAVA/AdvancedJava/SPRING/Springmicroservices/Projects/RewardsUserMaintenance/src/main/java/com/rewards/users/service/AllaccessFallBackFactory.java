package com.rewards.users.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import feign.FeignException;
import feign.hystrix.FallbackFactory;

@Component
public class AllaccessFallBackFactory implements FallbackFactory<UserMaintenanceClient> {

	@Override
	public UserMaintenanceClient create(Throwable cause) {
		
		return new AllaccessclientFallback(cause);
	}

	
}


 class AllaccessclientFallback implements UserMaintenanceClient{
	 Throwable cause;
	 Logger logger = LoggerFactory.getLogger(this.getClass());
	 public AllaccessclientFallback(Throwable cause) {
		this.cause =cause;
	}
	

	@Override
	public String getAllaccess() {
		if(cause instanceof FeignException	&& ((FeignException)cause).status() ==404) {
			logger.error("service is down");
		}
		return "daummy";
	}

	
}
