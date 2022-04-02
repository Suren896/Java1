package com.geekbrains.lesson1.practice3;

public class lesson3 {

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5(7,3);
//        task6();
        task7();

    }

    public static void task1() {
        int[] array = {0, 1, 0, 1, 0, 1, 0, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
            System.out.println(array[i]);
        }
    }

    public static void task2() {
        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
            System.out.println(array2[i]);
        }
    }

    public static void task3() {
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] = array3[i] * 2;
            }
            System.out.println(array3[i]);
        }
    }

    public static void task4() {
        int[][] massiv = new int[4][4];
        for (int i = 0; i < 4; i++) {
            massiv[i][i] = 1;
            System.out.println(massiv[i][i]);
        }

        for (int i = 0; i < 4; i++) {
            massiv[i][3 - i] = 1;
            System.out.println(massiv[i][i]);
        }
    }

    public static int task5(int len, int initialValue) {
        int[] massiv = new int[len];
        for (int i = 0; i < len; i++) {
            massiv[i] = initialValue;
        }
        return len;
    }

    public static void task6() {
        int min = 0;
        int max = 0;
        int[] massiv = {-44, 5, 2, 6, 1, 0, -4, -15, 6};

        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] < min) {
                min = massiv[i];
            }
        }
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] > max) {
                max = massiv[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
//    пытался решить, не получилось(((
//    public static boolean task7() {
//        int[] array = {3, 5, 8, 6, 2, 7, 1};
//
//        int chislo = 0;
//        for (int i = 0; i < array.length; i++) {
//            chislo = array[i];
//            for (int j = 0; j < array.length; j++) {
//                if (chislo == array[i]) {
//                    System.out.println(true);
//                    return true;
//                }
//
//            }
//        }
//        System.out.println(false);
//        return false;
//
//    }
}
