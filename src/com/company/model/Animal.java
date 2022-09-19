package com.company.model;

/**
 * Created by Chernykh on 10.09.2022
 */
public abstract class Animal {

  private String name;
  public static int totalCountAnimal = 0;

  public Animal(String name) {
    this.name = name;
    totalCountAnimal++;
  }

  public String getName() {
    return name;
  }

  public abstract void run(int distance);

  public abstract void swim(int distance);
}
