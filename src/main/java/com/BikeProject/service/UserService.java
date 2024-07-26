package com.BikeProject.service;

import com.BikeProject.dto.UserSignupDto;
import com.BikeProject.entity.User;

public interface UserService {

	UserSignupDto signup(UserSignupDto userSignupDTO);

}
