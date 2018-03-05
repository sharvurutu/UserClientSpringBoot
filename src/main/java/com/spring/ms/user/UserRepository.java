package com.spring.ms.user;

import java.util.List;

public interface UserRepository {
	List<User> getAllUsers();
	
	User getUser(String userId);

}
