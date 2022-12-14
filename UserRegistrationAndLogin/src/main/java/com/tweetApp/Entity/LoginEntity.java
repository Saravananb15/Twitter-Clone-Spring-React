package com.tweetApp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoginEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String userName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	

	public LoginEntity(Long id, String userName) {
		super();
		this.id = id;
		this.userName = userName;
	}

	public LoginEntity() {
		super();
	}

	@Override
	public String toString() {
		return "LoginEntity [id=" + id + ", userName=" + userName + "]";
	}

	
}
