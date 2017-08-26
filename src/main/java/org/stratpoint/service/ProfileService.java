package org.stratpoint.service;

import org.stratpoint.entity.Profile;

public interface ProfileService {
	Profile[] getProfiles();
	Profile getProfile(String id);
}
