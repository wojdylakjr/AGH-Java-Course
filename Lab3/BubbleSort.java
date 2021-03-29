package com.company;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[] { 4, 2, 0, 2, 10, 1, 9, 12, 3, 5 };
        sort(numbers);
        printNumbers(numbers);


    }

    public static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (isGreaterThan(numbers[j], numbers[j + 1])) {
                    swap(numbers,j,j+1);
                }
            }
        }
    }

    public static void swap(int []tab,int a, int b) {
        int temp;
        temp = tab[b];
        tab[b] = tab[a];
        tab[a] = temp;
    }
    public static boolean isGreaterThan(int a, int b) {
        return (a>b);
    }
    public static void printNumbers(int[] tab) {
        for (int value : tab) System.out.println(value);
    }
}
