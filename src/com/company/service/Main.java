package com.company.service;

import com.company.model.Animal;
import com.company.model.Cat;
import com.company.model.Dog;

/**
 * Created by Chernykh on 10.09.2022
 */
public class Main {

  public static void main(String[] args) {

    Animal dog1 = new Dog("Барсик", "pariah-dog");
    Dog dog2 = new Dog("Стрелка", "пудель");
    Cat cat1 = new Cat("Мурзик", "черный");
    Cat cat2 = new Cat("Пушок", "белый");
    Animal animal1 = new Cat("Леопольд", "рыжый");

    dog1.run(1000);
    dog2.swim(500);
    cat1.run(20);
    cat2.swim(1);
    animal1.swim(5);

    System.out.println("Количество животных " + Animal.total_countAnimal);
    System.out.println("Количество котов " + Cat.countCats);
    System.out.println("Количество котов " + Dog.countDogs);

  }
}
