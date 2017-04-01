package com.sfh.travel.trip;

import java.util.ArrayList;

public class Trip {
	
	private String tripId;
	private String userId;
	private String name;
	private ArrayList<String> location = new ArrayList<String>();
	
//Constructors

	public Trip(String tripId, String userId, String name) {
		super();
		this.tripId = tripId;
		this.userId = userId;
		this.name = name;
	}
	
	//TODO update constructor to support multiple locations
	public Trip(String tripId, String userId, String name, String location) {
		super();
		this.tripId = tripId;
		this.userId = userId;
		this.name = name;
		this.location.add(location);
	}

	public Trip() {
	}

//Getters and setters
	public String getTripId() {
		return tripId;
	}
	
	public void setTripId(String id) {
		this.tripId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	//Update location
	public void addLocation(String loc) {
		location.add(loc);
	}
	
	public void removeLocation(String loc) {
		for(int i = 0; i < location.size(); i++) {
			if (location.get(i).equals(loc)) {
				location.remove(i);
			}
		
		}
	}
}
