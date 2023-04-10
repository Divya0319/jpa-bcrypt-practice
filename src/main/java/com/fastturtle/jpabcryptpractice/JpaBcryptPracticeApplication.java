package com.fastturtle.jpabcryptpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class JpaBcryptPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaBcryptPracticeApplication.class, args);
	}

}
