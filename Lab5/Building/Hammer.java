package com.company;

public class Hammer {

    // klasa Hammer powinna przechowywac informacje o swoim producencie (jako String)
    private String pruducer;


    // informacja o producencie powinna byc ustawiana na stale w jej konstruktorze
    public Hammer(String pruducer) {
        this.pruducer = pruducer;
    }

    // powinna też mieć metode pozwalajaca wbic gwozdz w sciane
    // metoda ta sprawdza, czy gwozdz byl uzyty
    // jezeli nie, to informuje (System.out.println) o tym jaki mlotek wbij gwozdz w jaka sciane
    // a nastepnie zmienia status gwozdzia na uzyty
    // jezeli tak, to informuje ze gwozdz byl juz zuzyty i nie da sie go wbic ponownie


    public void hitTheNail(Nail nail, Wall wall) {
        if (!nail.isUsed()) {
            System.out.println("Mozna wbic mlotek w sciane o kolorze: " + wall.getColor() + "przez firme: " + pruducer);
            nail.setUsed(true);
        } else {
            System.out.println("Nie mozna wbic mlotek w sciane o kolorze: " + wall.getColor());
        }
    }

}
