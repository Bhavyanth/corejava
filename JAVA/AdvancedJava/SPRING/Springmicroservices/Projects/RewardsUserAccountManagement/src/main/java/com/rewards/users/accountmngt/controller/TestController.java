package com.rewards.users.accountmngt.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/account")
public class TestController {
	@GetMapping("/checkaccess")
	public String allAccess() {
		return "user account management.";
	}

	@PostMapping
	public String userAccess() {
		return "User Content.";
	}

	@DeleteMapping
	public String moderatorAccess() {
		return "Moderator Board.";
	}
@PutMapping
	public String adminAccess() {
	
		return "Admin Board.";
	}

}
