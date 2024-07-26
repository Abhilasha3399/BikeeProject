package com.BikeProject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserSignupDto {
	private String username;
	 private String email;
	 private String phoneNo;
	 private String password;

}
