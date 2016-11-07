package com.hn.service.impl;

import org.springframework.stereotype.Service;

import com.hn.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	public boolean checkUserPassword(String userId, String password) {
		Boolean b = false;
		System.out.println("check....userId:"+userId+" password:"+password);
		if("admin@admin.com".equals(userId) && "123".equals(password)){
			b = true;
		}
		return b;
	}
	
}
