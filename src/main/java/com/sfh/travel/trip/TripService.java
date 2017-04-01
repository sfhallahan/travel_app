package com.sfh.travel.trip;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class TripService {
	
	private ArrayList<Trip> tripsList = new ArrayList<Trip>();

	public TripService(){
		tripsList.add(new Trip(100, "Trip to Columbia"));
		tripsList.add(new Trip(100, "Trip to San Diego"));
		tripsList.add(new Trip(100, "Trip to Deleware"));
	}
	
	public ArrayList<Trip> getAllTrips() {
		return tripsList;
	}
	
}