package com.alex.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.core.dao.Microservice1Dao;

@Service
public class Microservice1Service {

	@Autowired
	Microservice1Dao dao;

	public String getMicroserviceName() {
		return dao.getMicroserviceName();
	}
}
