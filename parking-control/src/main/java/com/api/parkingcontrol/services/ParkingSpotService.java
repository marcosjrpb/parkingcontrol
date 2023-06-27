package com.api.parkingcontrol.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.api.parkingcontrol.model.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;

import jakarta.transaction.Transactional;

@Service
public class ParkingSpotService {

    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }
    
    public boolean existsByLicensePlateCar(String licensePlateCar) {
    		
    	
    	return  parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
    	
    }
    public  boolean existsByParkingSpotNumber(String numero) {
    	
    	return parkingSpotRepository.existsByParkingSpotNumber(numero);
    }

   public boolean existsByApartmentAndBlock(String block, String ap) {
	   
	   return parkingSpotRepository.existsByApartmentAndBlock(block, ap);
   }

public List<ParkingSpotModel>findAll() {
	
	return parkingSpotRepository.findAll();
			
}

public Optional<ParkingSpotModel> findById(UUID id) {
	return parkingSpotRepository.findById(id);
}
	
	

	
	
}
