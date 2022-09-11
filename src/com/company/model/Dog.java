package com.company.model;

/**
 * Created by Chernykh on 10.09.2022
 */
public class Dog extends Animal {

  private final int distanceLimRun = 500;
  private final int distanceLimSwim = 10;
  public static int countDogs = 0;


  public Dog(String name, int age, int weight) {
    super(name, age, weight);
    countDogs++;
  }

  @Override
  public void run(int distanceRunning) {
    super.run(distanceRunning);
  }

  @Override
  public void swim(int distance) {
    super.swim(distance);
  }
}
