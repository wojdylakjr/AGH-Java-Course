package com.company;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private List<Dish> menu = new ArrayList<>();

    public void  addToMenu(Dish dish) {
        menu.add(dish);

    }

    public Restaurant(String name) {
        this.name = name;
    }


}
