package com.BikeProject.service;

import java.util.List;

import com.BikeProject.dto.LocationDto;
import com.BikeProject.dto.LocationNameDto;

public interface LocationService {

	LocationDto addLocation(Long cityId, LocationDto locationDtO);

	List<String> getLocationNamesByCityId(Long cityId);

	void deleteLocationByCityId(Long cityId, Long locationId);
}
