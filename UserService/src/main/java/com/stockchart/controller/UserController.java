package com.stockchart.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stockchart.model.UserRequestModel;
import com.stockchart.model.UserResponseModel;
import com.stockchart.service.UserService;

@RestController
public class UserController {
	
	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@PostMapping(value = "/signUp")
    public ResponseEntity<UserResponseModel> signUp(@RequestBody UserRequestModel userRequestModel) {
		return new ResponseEntity<>(userService.createNewUser(userRequestModel), HttpStatus.OK);
	}
	
	@PostMapping(value = "/logIn")
    public ResponseEntity<UserResponseModel> logIn(@RequestBody UserRequestModel userRequestModel) {
		return new ResponseEntity<>(userService.createNewUser(userRequestModel), HttpStatus.OK);
	}
	
}
