package com.example.titanic.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.titanic.model.Titanic;
import com.example.titanic.repository.TitanicRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TitanicController {
  @Autowired
  TitanicRepository titanicRepository;

  @GetMapping("/survived")
  public List<Titanic> survived(@RequestParam Integer value) {
    List<Titanic> list = titanicRepository.findBySurvived(value);
    return list;
  }
  
  @GetMapping("/name")
  public List<Titanic> name(@RequestParam String value) {
    List<Titanic> list = titanicRepository.findByNameContainingIgnoreCase(value);
    return list;
  }

}
