package com.api.parkingcontrol.services;

import org.springframework.stereotype.Service;

import com.api.parkingcontrol.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotServices {
	
	final ParkingSpotRepository parkingSpotRepository;

	public ParkingSpotServices(ParkingSpotRepository parkingSpotRepository) {
		super();
		this.parkingSpotRepository = parkingSpotRepository;
	}
	
	

	
	
}
