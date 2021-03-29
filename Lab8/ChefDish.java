package com.company;

public class ChefDish extends Dish {
    public ChefDish(String name, int price) {
        super(name, price);
    }
    @Override
    public String toString() {
        return "Chef dish: " + name + " " + price;
    }
}
