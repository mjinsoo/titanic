package com.example.titanic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.titanic.model.Titanic;

public interface TitanicRepository extends JpaRepository<Titanic, Integer> {
  List<Titanic> findBySurvived(Integer value);
  List<Titanic> findByNameContainingIgnoreCase(String value);
}
