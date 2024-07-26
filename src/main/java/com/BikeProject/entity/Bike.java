package com.BikeProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bike {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bikeid;
	private String bikeName;
	private String bikeNumber;
	private String fuelType;
	private String power;
	private String bikePhoto;
	private boolean availability;

}
