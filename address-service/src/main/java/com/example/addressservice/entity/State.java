package com.example.addressservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "state")
@Data
public class State {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String stateName;
	private String stateCapital;
	
	
	
}
