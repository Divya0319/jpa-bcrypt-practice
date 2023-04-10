package com.fastturtle.jpabcryptpractice.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	PasswordEncoder passwordEncoder;

	@Autowired
	UserService userService;
	
	@PostMapping("/api/users")
	public Users createUser(@RequestBody Users user) {
		return this.userService.save(user);
	}
	
	@GetMapping("/api/verifyPass")
	public String verifyPassword(@RequestParam("pass") String pass, @RequestParam("id") int id) {
		passwordEncoder = new BCryptPasswordEncoder();
		
		Users user = userService.getById(id);
		
		if(passwordEncoder.matches(pass, user.getPassword())) {
			return "Password matched";
		}
		
		return "Password  NOT matched";
	}
}
