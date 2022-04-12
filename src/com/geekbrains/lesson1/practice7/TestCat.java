package com.geekbrains.lesson1.practice7;

import java.lang.reflect.Array;
import java.util.Random;

public class TestCat {
    public static void main(String[] args) {

        Cat cat2[] = new Cat[3];
        cat2[0] = new Cat("Борис", 15);
        cat2[1] = new Cat("Барсик", 17);
        cat2[2] = new Cat("Маркиз", 10);
        // Cat cat = new Cat("Мурзик", 150);
        Plate plate = new Plate(100);

        plate.infoPlate();
        for (int i = 0; i < cat2.length; i++) {
            if (cat2[i].checkPlate(plate) == false) {
                cat2[i].eating(plate);
            }
            cat2[i].isSatiety(plate);
            plate.infoPlate();
        }




//        plate.infoPlate();
//        if (cat.checkPlate(plate) == false) {
//            cat.eating(plate);
//        }
//         cat.isSatiety(plate);
//         plate.infoPlate();

    }
}