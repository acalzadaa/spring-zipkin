package com.alex.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.core.dao.Microservice3Dao;

@Service
public class Microservice3Service {

	@Autowired
	Microservice3Dao dao;

	public String getMicroserviceName() {
		return dao.getMicroserviceName();
	}
}
