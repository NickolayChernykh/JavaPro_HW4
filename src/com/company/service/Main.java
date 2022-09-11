package com.company.service;

import com.company.model.Animal;
import com.company.model.Cat;
import com.company.model.Dog;

/**
 * Created by Chernykh on 10.09.2022
 */
public class Main {

  public static void main(String[] args) {

    Animal dog1 = new Dog("Барсик", 3, 4);
    Dog dog2 = new Dog("Барси", 12, 22);
    Cat cat1 = new Cat("Мурзик", 4, 6);
    Cat cat2 = new Cat("Мурзи", 1, 4);
    Animal animal1 = new Cat("1", 15, 4);

    dog1.run(1000);
    dog1.swim(500);
    cat1.run(20);
    cat1.swim(1);

    System.out.println(Animal.total_countAnimal);
    System.out.println(Cat.countCats);
    System.out.println(Dog.countDogs);

  }
}
