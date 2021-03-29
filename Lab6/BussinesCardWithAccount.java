package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class BussinesCardWithAccount extends BussinesCard {
    private static final char BORDER_CHAR='#';
    private String accountNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BussinesCardWithAccount(String name, String surname, int phoneNumber, String accountNumber) {
        super(name, surname, phoneNumber);
        this.accountNumber = accountNumber;
    }

    protected ArrayList<String> getLines(){
        ArrayList<String> newLines = super.getLines();
        newLines.add(accountNumber);

        return newLines;
    }
    @Override
    protected char getBorderChar() {
        return BORDER_CHAR;
    }



    @Override
    public int hashCode() {
        return Objects.hash(getAccountNumber());
    }
}
