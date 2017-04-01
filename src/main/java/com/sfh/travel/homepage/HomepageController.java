package com.sfh.travel.homepage;

import com.sfh.travel.trip.TripService;
import com.sfh.travel.profile.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.ArrayList;

@RestController
public class HomepageController {

	@Autowired
	private TripService tripService;
	
	@Autowired
	private ProfileService profileService;
	
	
	@RequestMapping(method=RequestMethod.GET, value="/home/{userId}")
	public ArrayList<Object> getHomepage(@PathVariable String userId) {
		ArrayList<Object> homepageContent = new ArrayList<Object>();
		homepageContent.add(profileService.getProfile(userId));
		homepageContent.add(tripService.getAllTrips(userId));
		return homepageContent;
	}
}
