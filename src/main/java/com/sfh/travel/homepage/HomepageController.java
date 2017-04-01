package com.sfh.travel.homepage;

import com.sfh.travel.trip.TripService;
import com.sfh.travel.trip.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.ArrayList;

@RestController
public class HomepageController {

	@Autowired
	private TripService tripService;
	
	
	@RequestMapping(method=RequestMethod.GET, value="/home")
	public ArrayList<Trip> getAllTrips() {
		return tripService.getAllTrips();
	}
}
