//package com.BikeProject.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//@Configuration
//@EnableWebSecurity
//public class Secutityconfig {
//	
//	@Bean
//    public BCryptPasswordEncoder bCryptPasswordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//	
//	
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//	    return http.csrf().disable()
//	            .authorizeRequests(authorize ->
//	                authorize
//	                    .requestMatchers("/user").permitAll()
//							//.requestMatchers("/api/ads/**","/api/photos/**").hasRole("ADMIN")
//							//.requestMatchers("/api/ads/user/**","/api/photos/news/**").hasAnyRole("USER","ADMIN")
////							.requestMatchers("/api/ads/**","/api/photos/**").hasRole("ADMIN")
//	                    .anyRequest().authenticated()
//	            )
//				.httpBasic()
//				.and()
//	            .build();
//	}
//
//}
