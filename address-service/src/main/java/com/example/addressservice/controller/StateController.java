package com.example.addressservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.addressservice.entity.State;
import com.example.addressservice.repository.StateRepository;

@RestController
public class StateController {

	@Autowired
	StateRepository stateRepository;
	
	@RequestMapping(path="states")
	public List<State> getAllStates() {
		return stateRepository.findAll();
	}
}
