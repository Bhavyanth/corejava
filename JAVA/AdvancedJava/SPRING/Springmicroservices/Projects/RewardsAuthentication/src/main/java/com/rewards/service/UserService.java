package com.rewards.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.rewards.entities.User;

public interface UserService {
	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

	User findUserByEmail(String email);

}
