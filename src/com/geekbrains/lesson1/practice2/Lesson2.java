package com.geekbrains.lesson1.practice2;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(task1(10,19));
        task2(0);
        System.out.println(task3(5));
        task4("Я сделал задание",6);
        System.out.println(task5(2022));
    }
    public static boolean task1(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }
    public static int task2 (int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
        return a;
    }
    public static boolean task3 (int b) {
        if (b >= 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void task4 (String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }
    public static boolean task5 (int year) {
        if (year % 4 == 0 && year % 100 !=0) {
            return true;
            }
        else if (year % 400 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}


