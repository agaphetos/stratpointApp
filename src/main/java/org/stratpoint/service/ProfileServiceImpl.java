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

@Service("profileService")
public class ProfileServiceImpl implements ProfileService {
	private static final Logger log = LoggerFactory.getLogger(ProfileServiceImpl.class);
	
	private String apiUri = "http://s3-ap-southeast-1.amazonaws.com/fundo/js/profiles.json";
	
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
	
	@Override
	public Profile[] getProfiles() {
		Profile[] profiles = restTemplate().getForObject(apiUri, Profile[].class);
		for (Profile record : profiles) {
			log.info(record.toString());
		}
		return profiles;
	}
	
	@Override
	public Profile getProfile(String id) {
		Profile profile = new Profile();
		Profile[] data = restTemplate().getForObject(apiUri, Profile[].class);
		for (Profile record : data) {
			if (record.getId().equals(id)) {
				log.info(id + " found.");
				profile = record;
			}
		}
		return profile;
	}
}
