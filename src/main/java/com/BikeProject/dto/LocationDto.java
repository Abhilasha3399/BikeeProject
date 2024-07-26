package com.BikeProject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocationDto {
	private Long locationId;
    private String locationName;
    private String locationAddress;

}
