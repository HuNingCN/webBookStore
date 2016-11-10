package com.hn.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hn.service.UserService;

@Controller
public class LoginAction {

	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@RequestMapping("signin/toSignin.action")
	public String toSigin(){
		return "signin/signin";
	}
	
	@RequestMapping("signin/signin.action")
	public @ResponseBody String sigin(Model model, @RequestParam(value="userId", required=false)String userId, @RequestParam(value="password", required=false)String password){
		if(userService.checkUserPassword(userId, password)){
			return "success";
		}
		System.out.println("sigin...");
		return "error";
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
