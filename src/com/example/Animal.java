package com.example;

/**
 * Created by Chernykh on 10.09.2022
 */
abstract class Animal {

  protected static int total_countAnimal = 0;
  private final int distanceLimRun = 0;
  private final int distanceLimSwim = 0;

  public Animal(String name, int age, int weight) {
    total_countAnimal++;
  }

  void run(int distance) {
  }

  void swim(int distance) {
  }
}
