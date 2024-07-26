package com.BikeProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BikeProject.dto.UserSignupDto;
import com.BikeProject.entity.User;
import com.BikeProject.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	

	 @Autowired
	  private UserService userService;
	
	
	 @PostMapping("/signup")
	    public ResponseEntity<UserSignupDto> signup(@RequestBody UserSignupDto userSignupDTO) {
	        UserSignupDto createdUser = userService.signup(userSignupDTO);
	        return ResponseEntity.ok(createdUser);
	    }
}
