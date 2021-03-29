package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BussinesCard card1 = new BussinesCardWithAccount("Jan", "Nowak", 12345678, "7326 4782 3678 4243");
        BussinesCard card2 = new BussinesCardWithAccount("Jan", "Nowak", 12345678, "7326 4782 3678 4243");
        if (card1.equals(card2)) {
            System.out.println("Sa rowne");
        }
        System.out.println(card1);

        ArrayList<BussinesCard> cards = new ArrayList<>();
        cards.add(new BussinesCardWithAccount("Piotr","Budynek",123,"23123 32121 321 "));
        cards.add(new BussinesCardWithAccount("Jan","Blok",123,"23123 32121 321 "));
        cards.add(new BussinesCard("Kuba","Dom",123));

        for(int i=0;i<3;i++){
            cards.get(i).print();
        }
    }
}
