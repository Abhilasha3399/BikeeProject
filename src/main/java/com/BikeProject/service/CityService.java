package com.BikeProject.service;

import java.util.List;

import com.BikeProject.dto.CityDto;

public interface CityService {

	CityDto addCity(CityDto cityDTO);

	List<CityDto> getAllCities();

	void deleteCity(Long cityId);

}
