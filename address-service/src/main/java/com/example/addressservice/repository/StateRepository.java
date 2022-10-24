package com.example.addressservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.addressservice.entity.State;

public interface StateRepository extends JpaRepository<State, Long> {

}
