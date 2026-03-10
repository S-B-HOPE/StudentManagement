package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;

public interface UserService {

	User createUser(UserDto dto);

	User updateUser(Long id, UserDto dto);

	void deleteUser(Long id);

	User getUser(Long id);

	List<User> getUsers();

}
