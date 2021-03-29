package com.company;

public class Dish {
    protected String name;
    protected int price;

    public Dish(String name, int price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Regular dish: " + name + " " + price;
    }

}
