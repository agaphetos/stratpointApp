package org.stratpoint.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.stratpoint.entity.Profile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

/*
 * This class contains implementation for our methods in ProfileService Class
 * Serves as a Service using @Service annotation 
 */
@Service("profileService")
public class ProfileServiceImpl implements ProfileService {
	private static final Logger log = LoggerFactory.getLogger(ProfileServiceImpl.class);
	
	/*
	 * apiUrl for our JSON API
	 */
	private String apiUri = "http://s3-ap-southeast-1.amazonaws.com/fundo/js/profiles.json";
	
	/*
	 * This method returns a RestTemplate with custom ObjectMapper
	 * to translate snake_case elements from our JSON API to camelCase elements on our application
	 * Annotated as Bean to define a Singleton method instance
	 */
	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		
	    MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
	    
	    ObjectMapper objectMapper = new ObjectMapper();
	    objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
	    
	    jsonConverter.setObjectMapper(objectMapper);
	    
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
	    messageConverters.add(jsonConverter);
	    
	    restTemplate.setMessageConverters(messageConverters);
		return restTemplate;
	}
	
	/*
	 * (non-Javadoc)
	 * This method contains implementation of getProfiles
	 * @return	Profile[]	collection of Profiles from our JSON API
	 * @see org.stratpoint.service.ProfileService#getProfiles()
	 */
	@Override
	public Profile[] getProfiles() {
		Profile[] profiles = restTemplate().getForObject(apiUri, Profile[].class);
		for (Profile record : profiles) {
			log.debug(record.toString());
		}
		return profiles;
	}
	
	/*
	 * (non-Javadoc)
	 * This method contains implementation of getProfile
	 * @param 	String		id for our specific Profile
	 * @return	Profile		a specific Profile from JSON API
	 * @see org.stratpoint.service.ProfileService#getProfile(java.lang.String)
	 */
	@Override
	public Profile getProfile(String id) {
		Profile profile = new Profile();
		Profile[] data = restTemplate().getForObject(apiUri, Profile[].class);
		for (Profile record : data) {
			if (record.getId().equals(id)) {
				log.debug(id + " found.");
				profile = record;
			}
		}
		return profile;
	}
}
