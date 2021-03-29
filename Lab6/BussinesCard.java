package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class BussinesCard {
    private static final char BORDER_CHAR='*';
    private String name;
    private String surname;
    private int phoneNumber;
    public BussinesCard() {
        this.name = "Imie" ;
        this.surname = "Nazwisko";
        this.phoneNumber = 123456789;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //zwrotna
        if (!(o instanceof BussinesCard)) return false;
        BussinesCard that = (BussinesCard) o;
        return getPhoneNumber() == that.getPhoneNumber() && //symetryczna, przechodnia
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getSurname(), that.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getPhoneNumber());
    }

    public BussinesCard(String name, String surname, int phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return "Wizytowka" +"\n"+ name +"\n"+ surname + "\n"+phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public  void print() {
        ArrayList<String> lines = getLines();

        int maxLength = getMaxLength(lines);

        String borderLine = "";
        for (int i = 0; i < maxLength + 2; i++) {
            borderLine += getBorderChar();
        }

        System.out.println(borderLine);

        for (String line : lines) {
            int lengthDiff = maxLength - line.length();

            for (int i = 0; i < lengthDiff; i++) {
                line += " ";
            }

            line = getBorderChar() + line + getBorderChar();

            System.out.println(line);
        }

        System.out.println(borderLine);
    }

    protected char getBorderChar() {
        return BORDER_CHAR;
    }


    private int getMaxLength(ArrayList<String> lines) {
        int maxLength = 0;

        for (String line : lines) {
            int lineLength = line.length();

            if (lineLength > maxLength) {
                maxLength = lineLength;
            }
        }

        return maxLength;
    }

    protected ArrayList<String> getLines() {
        ArrayList<String> lines = new ArrayList<>();

        lines.add(name + " " + surname);
        lines.add("tel. " + phoneNumber);


        return lines;
    }
}
