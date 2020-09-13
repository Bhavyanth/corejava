package com.rewards.users.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="rewardsuseraccountmanagement" ,fallbackFactory   = AllaccessFallBackFactory.class)
public interface UserMaintenanceClient {
	
	@GetMapping("/account/checkaccess")
	public String getAllaccess();

}
