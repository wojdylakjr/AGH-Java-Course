package com.company;

public class Wall {

    // sciana przechowuje informacje o tym, jaki ma kolor (jako String)
    private String color;


    // informacja o kolorze powinna byc ustawiana w konstruktorze sciany
    public Wall(String color) {
        this.color = color;
    }


    // powinna byc tez mozliwosc zmiany koloru sciany po jej stworzeniu
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
