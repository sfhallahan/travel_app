package com.sfh.travel.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class ProfileController {
	
	@Autowired
	private ProfileService profileService;
	
	
	@RequestMapping(method=RequestMethod.GET, value="/profile/{id}")
	public Object getProfile(@PathVariable String id) {
		return profileService.getProfile(id);
	}
}
