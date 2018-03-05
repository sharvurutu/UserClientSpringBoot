package com.spring.ms.user;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	protected Logger logger = Logger.getLogger(UserController.class.getName());

	@Autowired
	UserRepository userRepository;

	@RequestMapping("/users/all")
	public User[] allUsers() {
		logger.info("Calling user microservice allUsers() .....");
		
		List<User> usr = userRepository.getAllUsers();
		
		logger.info("Usr MS.... allUsers() found: " + usr.size());
		return usr.toArray(new User[usr.size()]);
	}

	@RequestMapping("/users/{userId}")
	public User byUserId(@PathVariable("userId") String id) {
		logger.info("Calling user microservice byUserId() .... " + id);
		
		User usr = userRepository.getUser(id);
		
		logger.info("User MS ... byUserId() found: " + usr);
		return usr;
	}
}
