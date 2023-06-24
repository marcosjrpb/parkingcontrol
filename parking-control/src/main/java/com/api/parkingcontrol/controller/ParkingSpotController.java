package com.api.parkingcontrol.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.parkingcontrol.dto.ParkingSpotDto;
import com.api.parkingcontrol.model.ParkingSpotModel;
import com.api.parkingcontrol.services.ParkingSpotServices;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600) 
@RequestMapping("/parking-spot")
public class ParkingSpotController {

	
	final ParkingSpotServices parkingSpotServices;

	public ParkingSpotController(ParkingSpotServices parkingSpotServices) {
		super();
		this.parkingSpotServices = parkingSpotServices;
	}
	
	@PostMapping
	public ResponseEntity<Object> salveParkingSpot(@RequestBody @Valid ParkingSpotDto parkingSpotDto){
		
		var parkingSpotModel = new ParkingSpotModel();
		BeanUtils.copyProperties(parkingSpotDto, parkingSpotModel);
		parkingSpotModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(parkingSpotServices.save(parkingSpotModel));
	}
	
	
	
}
