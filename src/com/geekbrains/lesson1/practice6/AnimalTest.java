package com.geekbrains.lesson1.practice6;

public class AnimalTest {

    public static void main(String[] args) {

        Dog dog = new Dog("Барбос", 11, "Лабрадор");
        Animal.a ++;
        Cat cat = new Cat("Мурзик", 7);
        Animal.a ++;

        dog.run(1350);
        dog.swim(4);
        cat.run(100);
        cat.swim(2);

        System.out.println(Animal.a);

    }
}
