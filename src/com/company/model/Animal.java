package com.company.model;

/**
 * Created by Chernykh on 10.09.2022
 */
public class Animal {

  private String name;
  public static int total_countAnimal = 0;

  public Animal(String name) {
    this.name = name;
    total_countAnimal++;
  }

  public String getName() {
    return name;
  }

  public void run(int distance) {
  }

  public void swim(int distance) {
  }
}
