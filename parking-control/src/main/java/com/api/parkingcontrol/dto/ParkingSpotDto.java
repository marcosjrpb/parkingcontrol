package com.api.parkingcontrol.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ParkingSpotDto {
	
	@NotBlank
	private String parkingSpotNumber;
	
	@NotBlank
	@Size(max = 7)
	private String licensePlateCar;
	@NotBlank
	private String branCar;
	@NotBlank
	private String modelCar;
	@NotBlank
	private String colorCar;
	@NotBlank
	private String responsibleName;
	@NotBlank
	private String apartament;
	@NotBlank
	private String block;
	
	
	

}
