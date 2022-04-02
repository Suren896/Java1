package com.geekbrains.lesson1.practice6;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super (name, age);
    }
    public void run (int a) {
        if (a > 200) {
            System.out.println(name + " столько метров пробежать не сможет");
        } else if (a < 1) {
            System.out.println("введте корректные данные");
        } else {
            System.out.println(name + " пробежал " + a + " метров");
        }
    }

    public void swim (int a) {
        System.out.println(name + " плавать не умеет");
    }

}