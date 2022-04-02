package com.geekbrains.lesson1.practice6;


public class Dog extends Animal {

    private String type;

    public Dog(String name, int age, String type) {
        super(name, age);
    }
    public void run (int a) {
        if (a > 500) {
            System.out.println(name + " столько метров пробежать не сможет");
        } else if (a < 1) {
            System.out.println("введте корректные данные");
        } else {
            System.out.println(name + " пробежал " + a + " метров");
        }
    }
    public void swim (int a) {
        if (a > 10) {
            System.out.println(name + " столько метров проплыть не сможет");
        } else if (a < 1) {
            System.out.println("введте корректные данные");
        } else {
            System.out.println(name + " проплыл " + a + " метров");
        }
    }
}