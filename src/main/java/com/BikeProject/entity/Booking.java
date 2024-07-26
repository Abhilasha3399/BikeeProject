package com.BikeProject.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String bookingId;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	private String discount;
	private String rating;
	private LocalDateTime startDateTime;  
	private LocalDateTime endtDateTime; 
	
    @ManyToOne
    private Location startLocation;
	    
    @ManyToOne
	private Location endLocation;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToOne
	@JoinColumn(name = "bike_id")
	private Bike bike;

	

}
