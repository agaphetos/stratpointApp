package org.stratpoint.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

/*
 * Configuration for WebMvc
 * This class defines the custom implementation for HttpMessageConverters  
 */

@Configuration
public class WebConfig extends WebMvcConfigurationSupport {
	
	/*
	 * Returns MappingJackson2HttpMessageConverter
	 * This method implements an ObjectMapper with support for PropertyNamingStrategy.SNAKE_CASE
	 * which translates element of an Object with names in camelCase to be translated to snake_case
	 */
	@Bean
	public MappingJackson2HttpMessageConverter customJackson2HttpMessageConverter() {
		MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
		
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
		
		jsonConverter.setObjectMapper(objectMapper);
		return jsonConverter;
	}
	
	/*
	 * (non-Javadoc)
	 * This method overrides default HttpMesageConverters and adds our custom HttpMessageConverter
	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport#configureMessageConverters(java.util.List)
	 */
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(customJackson2HttpMessageConverter());
		super.addDefaultHttpMessageConverters(converters);
	}
}
