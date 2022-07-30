package com.tweetApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetApp.Entity.LoginEntity;
import com.tweetApp.Repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	LoginRepository loginRepo;

	@Override
	public LoginEntity register(LoginEntity loginEntity) {
		return loginRepo.save(loginEntity);
	}

}
