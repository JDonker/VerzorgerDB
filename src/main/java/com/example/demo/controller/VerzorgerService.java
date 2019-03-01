package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Verzorger;

@Service
@Transactional
public class VerzorgerService {
	
	@Autowired
	private verzorgerRepository verzorgerRepository;
	
	// maakt een iterable lijst van alle verzorgers
	public Iterable<Verzorger>  findAll() {
		Iterable<Verzorger> verzorgers = verzorgerRepository.findAll();

		return verzorgers;
	}
	
	
	// hier wordt een niewe verzorger toegevoegd aan de repository
	public Verzorger save(Verzorger verzorger){
		return verzorgerRepository.save(verzorger);
	}
}
