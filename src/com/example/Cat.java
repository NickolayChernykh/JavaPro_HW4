package com.example;

/**
 * Created by Chernykh on 10.09.2022
 */
public class Cat extends Animal {
    private final int distanceLimRun = 200;
    private final int distanceLimSwim = 0;
    static int countCats = 0;

    public Cat(String name, int age, int weight) {
        super(name, age, weight);
        countCats++;
    }

    @Override
    void run(int distance) {
        System.out.println(44444);
    }

    @Override
    void swim(int distance) {
        super.swim(distance);
    }
}
