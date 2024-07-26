package com.BikeProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BikeProject.dto.CityDto;
import com.BikeProject.service.CityService;

@RestController
@RequestMapping("/city")
public class CityController {
	@Autowired
	private CityService cityService;
	
	
	 @PostMapping("/admin/add")
	 public ResponseEntity<CityDto> addCity(@RequestBody CityDto cityDTO) {
	 CityDto savedCity = cityService.addCity(cityDTO);
	 return ResponseEntity.ok(savedCity);
	    }
	 
	 
    @GetMapping("/user/get-All")
	public ResponseEntity<List<CityDto>> getAllCities() {
	List<CityDto> cities = cityService.getAllCities();
	 return ResponseEntity.ok(cities);
	    }
    
    @DeleteMapping("/admin/{cityId}")
    public ResponseEntity<Void> deleteCity(@PathVariable Long cityId) {
        cityService.deleteCity(cityId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
