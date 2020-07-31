package com.alex.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.core.dao.Microservice2Dao;

@Service
public class Microservice2Service {

	@Autowired
	Microservice2Dao dao;

	public String getMicroserviceName() {
		return dao.getMicroserviceName();
	}
}
