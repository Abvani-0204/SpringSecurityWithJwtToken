package com.sp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sp.model.ApiResponse;
import com.sp.model.User;
import com.sp.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/save")
	public ApiResponse<User> saveRecord(@RequestBody User userModel) {
		return new ApiResponse<>(HttpStatus.OK.value(), "User saved successfully.", userService.saveRecord(userModel));
	}
}
