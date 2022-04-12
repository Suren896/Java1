package com.geekbrains.lesson1.practice7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isSatiety;

    public Cat(String name, int foodQuantity) {
        this.name = name;
        this.appetite = foodQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return isSatiety;
    }

    public void setSatiety(boolean satiety) {
        isSatiety = satiety;
    }

    public void eating (Plate plate) {
        System.out.println(name + " поела " + appetite + " еды");
//            System.out.println("Кошка поела " + appetite + " еды");
            plate.decreaseFood(appetite);

            isSatiety = true;
        }

    public boolean checkPlate (Plate plate) {
        if (appetite > plate.getFoodQuantity()) {
            System.out.println("насыпьте кошке еды, ей этого мало, она это есть не будет!");
        return true;
        }  else  {
            return false;
        }
    }
    public boolean isSatiety (Plate plate) {
        if (isSatiety == false) {
            System.out.println("Кошка голодная");
            plate.addFood();
            eating(plate);
            return false;
        } else {
            System.out.println("Кошка сыта");
        }
       return true;
    }
}

