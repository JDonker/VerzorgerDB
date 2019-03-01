package com.example.demo.controller;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.demo.Verzorger;

@Component
public interface verzorgerRepository extends CrudRepository<Verzorger, Long>{

}
