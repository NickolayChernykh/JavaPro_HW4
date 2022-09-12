package com.company.model;

/**
 * Created by Chernykh on 10.09.2022
 */
public class Dog extends Animal {

  private int distanceLimRun = 500;
  private int distanceLimSwim = 10;
  private String breed;
  public static int countDogs = 0;


  public Dog(String name, String breed) {
    super(name);
    this.breed = breed;
    countDogs++;
  }

  @Override
  public void run(int distanceRunning) {
    if (distanceRunning <= distanceLimRun) {
      System.out.println(getName() + " пробежал " + distanceRunning + " метров");
    } else {
      System.out.println(getName() + " пробежал " + distanceLimRun +
          " метров " + "и больше не смог");
    }
  }

  @Override
  public void swim(int distanceSwim) {
    if (distanceSwim <= distanceLimSwim) {
      System.out.println(getName() + " проплыл " + distanceSwim + " метров");
    } else {
      System.out.println(getName() + " проплыл " + distanceLimSwim +
          " метров " + "и больше не смог");
    }
  }
}
