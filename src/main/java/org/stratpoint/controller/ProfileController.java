package org.stratpoint.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.stratpoint.entity.Profile;
import org.stratpoint.service.ProfileService;

@RestController
public class ProfileController {
	
	private static final Logger log = LoggerFactory.getLogger(ProfileController.class);

	@Autowired
	private ProfileService profileService;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public Profile[] getProfiles() {
		log.info("GET profiles");
		return profileService.getProfiles();
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "/profile/{id}", method = RequestMethod.GET)
	public Profile getProfile(@PathVariable("id") String id) {
		log.info("GET profile with id: " + id);
		Profile profile = profileService.getProfile(id);
		if (profile == null) {
			return null;
		}
		return profile;
	}
}
