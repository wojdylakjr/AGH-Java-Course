package com.company;


import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Dish> order = new ArrayList();

    public void addToOrder(Dish dish) {
        order.add(dish);
    }

    public void printOrder() {
        System.out.println(order);
    }

}
