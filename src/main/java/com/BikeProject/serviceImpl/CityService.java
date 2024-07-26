package com.BikeProject.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikeProject.dto.CityDto;
import com.BikeProject.entity.City;
import com.BikeProject.repository.CityRepository;

@Service
public class CityService implements com.BikeProject.service.CityService {
	
	@Autowired
	private CityRepository cityRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CityDto addCity(CityDto cityDTO) {
     City city = modelMapper.map(cityDTO, City.class);
	 City savedCity = cityRepo.save(city);
	 return modelMapper.map(savedCity, CityDto.class);
	}

	@Override
	public List<CityDto> getAllCities() {
		 return cityRepo.findAll().stream()
	                .map(city -> modelMapper.map(city, CityDto.class))
	                .collect(Collectors.toList());
	}

	@Override
	public void deleteCity(Long cityId) {
	cityRepo.deleteById(cityId);
	}

}
