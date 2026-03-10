package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.exception.UserServiceException;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	private User convertDtoToEntity(UserDto dto) {

		User user = new User();
		user.setName(dto.getName());
		user.setEmail(dto.getEmail());
		user.setPhone(dto.getPhone());

		return user;

	}

	@Override
	public User createUser(UserDto dto) {

		User user = convertDtoToEntity(dto);
		return userRepository.save(user);
	}

	@Override
	public User updateUser(Long id, UserDto dto) {

		User user = userRepository.findById(id).orElseThrow(() -> new UserServiceException("User not found"));

		user.setName(dto.getName());
		user.setEmail(dto.getEmail());
		user.setPhone(dto.getPhone());

		return userRepository.save(user);

	}

	@Override
	public void deleteUser(Long id) {

		User user = userRepository.findById(id).orElseThrow(() -> new UserServiceException("User not found"));

		userRepository.delete(user);

	}

	@Override
	public User getUser(Long id) {

		return userRepository.findById(id).orElseThrow(() -> new UserServiceException("User not found"));

	}

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}

}
