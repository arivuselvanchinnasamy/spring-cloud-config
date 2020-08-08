package com.arivu.customer.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CustomerRestV1Controller {

	@Value("${spring.datasource.url:null}")
	private String dbUrl;
	
	@Value("${spring.jpa.database:null}")
	private String jpaDatabase;
	
	@Value("${spring.datasource.username:null}")
	private String dbUserName;
	
	@Value("${spring.datasource.password:null}")
	private String dbPassword;
	
	@GetMapping
	public ResponseEntity<Map<String, String>> fetchProperties() {
		Map<String, String> properties = new HashMap<>();
		properties.put("dbUrl", dbUrl);
		properties.put("jpaDatabase", jpaDatabase);
		properties.put("dbUserName", dbUserName);
		properties.put("dbPassword", dbPassword);
	      return ResponseEntity.ok(properties);
	}
}
