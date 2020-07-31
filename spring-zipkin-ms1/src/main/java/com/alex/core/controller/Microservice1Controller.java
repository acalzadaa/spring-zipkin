package com.alex.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.alex.core.service.Microservice1Service;

@RestController
@RequestMapping("micro1")
public class Microservice1Controller {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	Microservice1Service service;

	@RequestMapping("name")
	public String getMicroserviceName() {
		String micro2Response = restTemplate.postForObject("http://localhost:8092/micro2/name", null, String.class);
		String micro3Response = restTemplate.postForObject("http://localhost:8093/micro3/name", null, String.class);
		return service.getMicroserviceName() + " : " + micro2Response + " : " + micro3Response;
	}
}