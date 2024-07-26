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

import com.BikeProject.dto.LocationDto;
import com.BikeProject.dto.LocationNameDto;
import com.BikeProject.service.LocationService;

@RestController
@RequestMapping("/Location")
public class LocationController {

 @Autowired	
 private LocationService locationService;
 
 @PostMapping("/{cityId}/locations")
 public ResponseEntity<LocationDto> addLocation(@PathVariable Long cityId, @RequestBody LocationDto locationDtO) {
 LocationDto savedLocation = locationService.addLocation(cityId, locationDtO);
  return new ResponseEntity<>(savedLocation, HttpStatus.CREATED);
 }
 
 @GetMapping("/{cityId}/locations/names")
 public ResponseEntity<List<String>> getLocationNamesByCityId(@PathVariable Long cityId) {
     List<String> locationNames = locationService.getLocationNamesByCityId(cityId);
     return ResponseEntity.ok(locationNames);
 }
 
 @DeleteMapping("/{cityId}/locations/{locationId}")
 public ResponseEntity<Void> deleteLocationByCityId(@PathVariable Long cityId, @PathVariable Long locationId) {
     locationService.deleteLocationByCityId(cityId, locationId);
     return new ResponseEntity<>(HttpStatus.NO_CONTENT);
 }

}
