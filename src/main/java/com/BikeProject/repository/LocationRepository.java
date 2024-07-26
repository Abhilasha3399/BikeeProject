package com.BikeProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.BikeProject.entity.Location;

import jakarta.transaction.Transactional;
@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {


	@Query("SELECT l.locationName FROM Location l WHERE l.city.cityid = :cityId")
	List<String> findLocationNamesByCityId(Long cityId);

	@Transactional
    @Modifying
    @Query("DELETE FROM Location l WHERE l.locationId = :locationId AND l.city.cityid = :cityId")
    void deleteByLocationIdAndCityId(Long locationId, Long cityId);
	

}
