package com.geekbrains.lesson1.practice7;

public class Plate {

    private int foodQuantity;

    public Plate(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }
    public int getFoodQuantity() {
        return foodQuantity;
    }
    public void setFoodQuantity(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }
    public void infoPlate () {
        System.out.println("Осталось " + foodQuantity + " еды");
    }
    public void decreaseFood(int foodQuantity){
        this.foodQuantity -= foodQuantity;
    }
    public void addFood (){
        foodQuantity += foodQuantity;
        System.out.println("добавили еды в миске теперь там " + foodQuantity + " еды");

    }
}
