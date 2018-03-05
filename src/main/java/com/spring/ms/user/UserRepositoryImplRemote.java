package com.spring.ms.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

public class UserRepositoryImplRemote implements UserRepository {

	@Autowired
	protected RestTemplate restTemplate;
	
	protected String serviceUrl;

	public UserRepositoryImplRemote(String serviceUrl) {
//		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl	: "http://" + serviceUrl;
		this.serviceUrl = serviceUrl;

	}

	@Override
	public List<User> getAllUsers() {
		User[] users = restTemplate.getForObject(serviceUrl+"/users/all", User[].class);
		return Arrays.asList(users);

	}

	@Override
	public User getUser(String id) {
		return restTemplate.getForObject(serviceUrl + "/users/{id}", User.class, id);

	}
}
