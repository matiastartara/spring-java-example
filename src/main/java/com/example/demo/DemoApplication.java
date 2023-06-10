package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private final Log LOGGER = LogFactory.getLog(DemoApplication.class);
	private UserRepository userRepository;
	public DemoApplication (UserRepository userRepository) {
		this.userRepository=userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
       saveUsersInDataBase();
	}

	private void saveUsersInDataBase() {
		User user1 = new User("john", "john@email.com", LocalDate.of(2023, 2, 4));
		User user2 = new User("julie", "julie@email.com", LocalDate.of(2023, 5, 4));

		List<User> list = Arrays.asList(user1, user2);
		list.stream().forEach(userRepository::save);
	}

}
