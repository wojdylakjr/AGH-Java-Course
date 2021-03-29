package com.company;


import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Data {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz jedna z dostepnych opcji:\n" +
                "1 - recznie podana data\n" +
                "2 - losowa data");

        int option = scanner.nextInt();
        switch (option) {
            case 1: {
                LocalDate date = loadUserDate();
                System.out.println("Wpisana data to: " + date);
                Period difference = Period.between(date, LocalDate.now());
                System.out.println("Roznica pomiedzy datami to: " + difference);
            }
            break;

            case 2: {
                LocalDate date = loadRandomDate();
                System.out.println("Wpisana data to: " + date);
                Period difference = Period.between(date, LocalDate.now());
                System.out.println("Roznica pomiedzy datami to: " + difference);
            }
            break;
        }


    }


    public static LocalDate loadUserDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj odpowiednio: rok, miesiac, dzien");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        LocalDate date = LocalDate.of(year, month, day);
        return date;

    }

    public static LocalDate loadRandomDate() {


        int year = generateRandomNumber(1000, 2100);
        int month = generateRandomNumber(1, 12);
        int day = generateRandomNumber(1, 31);
        LocalDate date = LocalDate.of(year, month, day);
        return date;

    }

    public static int generateRandomNumber(int from, int to) {
        double f = Math.random() / Math.nextDown(1.0);
        int x = (int) (from * (1.0 - f) + to * f);
        return x;
    }
}