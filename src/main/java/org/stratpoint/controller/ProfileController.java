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

/*
 * RestController for Profile
 * This class defines the implementation for mapping of profiles REST service 
 */

@RestController
public class ProfileController {
	
	private static final Logger log = LoggerFactory.getLogger(ProfileController.class);

	/*
	 * Inject an instance of ProfileService
	 */
	@Autowired
	private ProfileService profileService;
	
	/*
	 * Returns an Array Profile when called on a Front-end Application
	 * using URL/profile with GET RequestMethod (ex. http://localhost:3000/profile)
	 */
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public Profile[] getProfiles() {
		log.info("GET profiles");
		return profileService.getProfiles();
	}

	/*
	 * Returns a specific Profile when called on a Front-end Application
	 * using URL/profile/{id} with GET RequestMethod (ex. http://localhost:3000/profile/1)
	 * 
	 * This method returns null when no Profile with id passed found
	 * 
	 * @param	id		the id of the profile requested to be found
	 * @return	Profile	the entity profile of the requested id
	 */
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
