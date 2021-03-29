package com.company;

public class DishOfTheDay extends Dish {

    public DishOfTheDay(String name, int price) {
        super(name, price);
    }
    @Override
    public String toString() {
        return "Dish of the day: " + name + " " + price;
    }
}
