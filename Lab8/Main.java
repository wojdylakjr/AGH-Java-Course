package com.company;

public class Main {

    public static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant("restaurant1");
        Restaurant restaurant2 = new Restaurant("restaurant2");
        Dish pizza = new DishOfTheDay("Pizza", 10);
        Dish soup = new ChefDish("soup", 5);
        Dish pierogi = new Dish("pierogi", 10);
        restaurant1.addToMenu(pizza);
        restaurant1.addToMenu(pierogi);
        restaurant2.addToMenu(soup);


        Basket basket = new Basket();
        basket.addToOrder(pizza);
        basket.addToOrder(pierogi);
        basket.printOrder();


    }
}
