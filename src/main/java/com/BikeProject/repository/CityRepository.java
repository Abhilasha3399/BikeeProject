package com.BikeProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikeProject.entity.City;
@Repository
public interface CityRepository extends JpaRepository<City, Long> {

}
