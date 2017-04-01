package com.sfh.travel.trip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class TripController {
	
	@Autowired
	private TripService tripService;
	
	
	@RequestMapping(method=RequestMethod.GET, value="/trip/{id}")
	public Object getTrip(@PathVariable String id) {
		return tripService.getTrip(id);
	}
	
	//TODO create html form for create new trip form
	//@RequestMapping(method=RequestMethod.GET, value="/trip/createNewTrip")
	//public void getCreateTripForm() { }
	
	@RequestMapping(method=RequestMethod.POST, value="/trip/createNewTrip")
	public void createTrip(@RequestBody Trip trip) {
		tripService.createTrip(trip);
	}
	
	
}
