package com.company.model;

/**
 * Created by Chernykh on 10.09.2022
 */
public class Animal {

  public static int total_countAnimal = 0;
//  private final int distanceLimRun = 0;
//  private final int distanceLimSwim = 0;

  public Animal(String name, int age, int weight) {
    total_countAnimal++;
  }

  public void run(int distance) {
  }

  public void swim(int distance) {
  }
}
