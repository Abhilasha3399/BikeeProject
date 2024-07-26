package com.BikeProject.serviceImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikeProject.dto.LocationDto;
import com.BikeProject.dto.LocationNameDto;
import com.BikeProject.entity.Location;
import com.BikeProject.repository.CityRepository;
import com.BikeProject.repository.LocationRepository;
import com.BikeProject.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	private LocationRepository locationRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public LocationDto addLocation(Long cityId, LocationDto locationDtO) {
		Location location = modelMapper.map(locationDtO, Location.class);
        location.setCity(cityRepository.findById(cityId).orElseThrow(() -> new RuntimeException("City not found")));
        Location savedLocation = locationRepository.save(location);
        return modelMapper.map(savedLocation, LocationDto.class);
	}

	@Override
	public List<String> getLocationNamesByCityId(Long cityId) {
		return locationRepository.findLocationNamesByCityId(cityId);
    
	}

	@Override
	public void deleteLocationByCityId(Long cityId, Long locationId) {
		 locationRepository.deleteByLocationIdAndCityId(locationId, cityId);
		
	}

	

}
