package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("user")
	ResponseEntity<User> createUser(@RequestBody UserDto dto) {

		userService.createUser(dto);
		return new ResponseEntity("user saved successfully", HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public User updateUser(@PathVariable Long id, @RequestBody UserDto dto) {

		return userService.updateUser(id, dto);

	}

	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
		return "User deleted";
	}

	@GetMapping
	public List<User> getUsers() {
		return userService.getUsers();
	}

}
