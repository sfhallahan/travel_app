package com.sfh.travel.trip;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class TripService {
	
	private ArrayList<Trip> tripsList = new ArrayList<Trip>();

	public TripService(){
		tripsList.add(new Trip("d00d","sfhallahan", "Trip to Columbia", "Columbia"));
		tripsList.add(new Trip("101", "zjknudson", "Trip to San Diego"));
		tripsList.add(new Trip("102", "sfhallahan", "Trip to Deleware", "Delaware"));
	}
	
	public ArrayList<Trip> getAllTrips(String userId) {
		ArrayList<Trip> userTrips = new ArrayList<Trip>();
		for(Trip trip:tripsList) {
			Trip t = trip;
			if(t.getUserId().equals(userId)){
				userTrips.add(t);
			}
		}
				
		return userTrips;
	}
	
	public Object getTrip(String id) {
		for(int i = 0; i < tripsList.size(); i++) {
			Trip t = tripsList.get(i);
			if (t.getTripId().equals(id)) {
				return t;
			}
		}
		return null;
	}

	public void createTrip(Trip trip) {
		tripsList.add(trip);
		
	}
	
}