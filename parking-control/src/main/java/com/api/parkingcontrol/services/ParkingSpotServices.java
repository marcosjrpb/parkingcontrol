package com.api.parkingcontrol.services;

import org.springframework.stereotype.Service;

import com.api.parkingcontrol.model.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;

import jakarta.transaction.Transactional;

@Service
public class ParkingSpotServices {
	
	final ParkingSpotRepository parkingSpotRepository;

	public ParkingSpotServices(ParkingSpotRepository parkingSpotRepository) {
		super();
		this.parkingSpotRepository = parkingSpotRepository;
	}
    @Transactional
	public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
		return parkingSpotRepository.save(parkingSpotModel);
	}
	
	

	
	
}
