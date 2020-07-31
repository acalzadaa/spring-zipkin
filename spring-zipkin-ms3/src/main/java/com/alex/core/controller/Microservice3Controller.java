package com.alex.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.alex.core.service.Microservice3Service;

@RestController
@RequestMapping("micro3")
public class Microservice3Controller {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	Microservice3Service service;

	@RequestMapping("name")
	public String getMicroserviceName() {
		return service.getMicroserviceName();
	}
}