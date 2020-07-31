package com.alex.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.alex.core.service.Microservice2Service;

@RestController
@RequestMapping("micro2")
public class Microservice2Controller {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	Microservice2Service service;

	@RequestMapping("name")
	public String getMicroserviceName() {
		return service.getMicroserviceName();
	}
}