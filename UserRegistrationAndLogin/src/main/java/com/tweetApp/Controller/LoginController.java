package com.tweetApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tweetApp.Entity.LoginEntity;
import com.tweetApp.Service.LoginService;

@RestController
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@PostMapping("/register")
	public LoginEntity register(@RequestBody LoginEntity loginEntity ) {
		return loginService.register(loginEntity);
		
	}
}
