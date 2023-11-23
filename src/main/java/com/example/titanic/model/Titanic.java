package com.example.titanic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Titanic {
  @Id
  Integer passengerid;
  @Column(nullable = true)
  Integer survived;
  @Column(nullable = true)
  Integer pclass;
  @Column(length = 255)
  String name;
  @Column(length = 10)
  String sex;
  @Column(nullable = true)
  Integer age;
  @Column(nullable = true)
  Integer sibsp;
  @Column(nullable = true)
  Integer parch;
  @Column(length = 50)
  String ticket;
  @Column(nullable = true)
  Integer fare;
  @Column(length = 50)
  String cabin;
  @Column(length = 10)
  String embarked;
}
