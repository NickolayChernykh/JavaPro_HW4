package com.company.model;

/**
 * Created by Chernykh on 10.09.2022
 */
public class Cat extends Animal {

  private final int distanceLimRun = 200;
  private final int distanceLimSwim = 0;
  private String color;
  public static int countCats = 0;

  public Cat(String name, String color) {
    super(name);
    this.color = color;
    countCats++;
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
  public void swim(int distance) {
    if (distance > distanceLimSwim) {
      System.out.println("Коты не умеют плавать!");
      System.out.println(getName() + " утонул, живодер!!!!");
    }
  }
}
