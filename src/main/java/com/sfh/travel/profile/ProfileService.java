package com.sfh.travel.profile;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class ProfileService {
	
	private ArrayList<Profile> profiles = new ArrayList<Profile>();
	
	public ProfileService () {
		profiles.add(new Profile("sfhallahan", "Sean", "Hallahan", "sfhallahan@gmail.com", "About Sean"));
		profiles.add(new Profile("zjknudson", "Zach", "Knudson", "zknudson@gmail.com", "About Zach"));
	}
	
	
	public Object getProfile(String id) {
		for(Profile profile:profiles) {
			Profile p = profile;
			if(p.getUserId().equals(id)){
				return p;
			}
		}
		return null;
	}

}
