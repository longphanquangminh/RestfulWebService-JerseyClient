package com.longphan.service;

import java.util.ArrayList;
import java.util.Arrays;

import com.longphan.model.Role;
import com.longphan.model.User;

/**
 * This is a dummy class to get the user information
 */
public class UserService {

	public User getUser(String username) {
		User user = new User();
		user.setUsername(username);
		user.setPassword("longphan");
		if ("admin".equals(username)) {
			user.setRoles(Arrays.asList(Role.ROLE_ADMIN));
		} else if ("customer".equals(username)) {
			user.setRoles(Arrays.asList(Role.ROLE_CUSTOMER));
		} else {
			user.setRoles(new ArrayList<>());
		}
		return user;
	}
}
