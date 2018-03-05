package com.spring.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.spring.ms.user.UserRepository;
import com.spring.ms.user.UserRepositoryImplRemote;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootUserClientApplication {
	public static final String UserServiceUrl = "http://USERS-MICROSERVICE";
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootUserClientApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	@Bean
	public UserRepository accountRepository(){
		return new UserRepositoryImplRemote(UserServiceUrl);
	}
}
