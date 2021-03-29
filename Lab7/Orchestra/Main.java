package com.company;

public class Main {

    public static void main(String[] args) {
        Orchestra zespol = new Orchestra();
        zespol.addInstrument(new Guitar());
        zespol.addInstrument(new Flute());
        zespol.addInstrument(new Trombone());
        zespol.play();
        Orchestra zespol2 = new Orchestra();
        zespol2.addInstrument(new Guitar());
        zespol2.addInstrument(zespol);
        zespol2.play();
    }
}
