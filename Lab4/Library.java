package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {


    private static String[] BOOKS = {"Priests Of Dawn",
            "Chicken Abroad",
            "Lord With Sins",
            "Chicken Abroad",
            "Fish And Horses",
            "Mistress Of Devotion",
            "Bandit Of The Void",
            "Lord With Sins",
            "Guardians And Gangsters",
            "Lions Of Dread",
            "Chicken Abroad",
            "Future Of Fire",
            "Priests Of Dawn",
            "Fish And Horses",
            "Chicken Abroad",
            "Fish And Horses",
            "Guardians And Gangsters",
            "Inception Of Heaven",
            "Lord With Sins",
            "Future Of Fire",
            "Driving Into The Depths",
            "Starting The Demons",
            "Maid With Blue Eyes",
            "Mistress Of Devotion",
            "Lovers In The Forest",
            "Fish And Horses",
            "Maid With Blue Eyes",
            "Destruction Of The Faceless Ones",
            "Guardians And Gangsters",
            "Chicken Abroad"};

    public static HashMap<String, Integer> createBooksCounter() {
        HashMap<String, Integer> booksMap = new HashMap<>();
        for (String book : BOOKS) {
            booksMap.put(book, 0);
            countBook(booksMap, book);
        }
        System.out.println(booksMap);


        return booksMap;
    }

    public static void countBook(HashMap<String, Integer> booksCounter, String book) {
        int counter=0;
        for (String s : BOOKS) {
            if (s.equals(book)) {
                booksCounter.put(book, ++counter);
            }
        }

    }

    public static ArrayList<String> findWhiteRavens(HashMap<String, Integer> booksCounter) {
        ArrayList <String> ravens = new ArrayList<>();
        for(String name : booksCounter.keySet()) {
            int p = booksCounter.get(name);
            if(p==1){
                ravens.add(name);
            }

        }
        return ravens;
    }

    public static void printWhiteRavens(ArrayList<String> whiteRavens) {
        for(String name : whiteRavens){
            System.out.println(name +" ");
        }
    }
}