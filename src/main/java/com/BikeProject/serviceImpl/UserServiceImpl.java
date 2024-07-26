package com.BikeProject.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.BikeProject.dto.UserSignupDto;
import com.BikeProject.entity.User;
import com.BikeProject.repository.UserRepository;
import com.BikeProject.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
//	 @Autowired
//	  private BCryptPasswordEncoder bCryptPasswordEncoder;

	

	@Override
	public UserSignupDto signup(UserSignupDto userSignupDTO) {
	        User user = modelMapper.map(userSignupDTO, User.class);
	      //  user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
	        user = userRepository.save(user);
	        return modelMapper.map(user, UserSignupDto.class);
	    }
	}


