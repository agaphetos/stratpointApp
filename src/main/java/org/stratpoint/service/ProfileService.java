package org.stratpoint.service;

import org.stratpoint.entity.Profile;

/*
 * Interface Service for Profile
 * contains method declarations for Profile Service
 */

public interface ProfileService {
	
	/*
	 * This method returns Profile Array
	 * @return	Profile[]	collection of Profiles
	 * @see	org.stratpoint.service.ProfileServiceImpl#getProfiles()
	 */
	Profile[] getProfiles();
	
	/*
	 * This method returns a specific Profile
	 * @return	Profile		a specific Profile
	 * @see	org.stratpoint.service.ProfileServiceImpl#getProfile(java.lang.String)
	 */
	Profile getProfile(String id);
}
