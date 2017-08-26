package org.stratpoint.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.stratpoint.entity.Profile;

@Service("profileService")
public class ProfileServiceImpl implements ProfileService {
	private static final Logger log = LoggerFactory.getLogger(ProfileServiceImpl.class);
	
	private String apiUri = "http://s3-ap-southeast-1.amazonaws.com/fundo/js/profiles.json";
	
	@Override
	public Profile[] getProfiles() {
		Profile[] profiles = new RestTemplate().getForObject(apiUri, Profile[].class);
		for (Profile record : profiles) {
			log.info(record.toString());
		}
		return new RestTemplate().getForObject(apiUri, Profile[].class);
	}
	
	@Override
	public Profile getProfile(String id) {
		Profile profile = new Profile();
		Profile[] data = new RestTemplate().getForObject(apiUri, Profile[].class);
		for (Profile record : data) {
			if (record.getId().equals(id)) {
				log.info(id + " found.");
				profile = record;
			}
		}
		return profile;
	}
}
