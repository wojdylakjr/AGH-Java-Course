package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
     //   Library booksMap = new Library();
       HashMap <String, Integer> mapa = Library.createBooksCounter();

       Library.printWhiteRavens( Library.findWhiteRavens(mapa));

    }
}
