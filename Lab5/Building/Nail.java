package com.company;

public class Nail {

    // gwozdz przechowuje informacje o tym czy byl uzyty (jako boolean)
    private boolean isUsed;

    public Nail(boolean isUsed) {
        this.isUsed = isUsed;
    }

    // nowo stworzony gwozdz nie jest uzyty
    public Nail() {
        this.isUsed = false;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }
}
