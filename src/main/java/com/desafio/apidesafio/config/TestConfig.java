package com.desafio.apidesafio.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.desafio.apidesafio.entiti.User;
import com.desafio.apidesafio.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1	= new User(null, "João teste", "test@email.com", "46999999999", "456333");	
		User u2	= new User(null, "Andre teste", "test@email.com", "46999999999", "456333");
		User u3	= new User(null, "Joana teste", "test@email.com", "46999999999", "456333");
		User u4	= new User(null, "Ana teste", "test@email.com", "46999999999", "456333");
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4));
	}
}
