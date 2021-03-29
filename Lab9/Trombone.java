package com.company;

public class Trombone extends SingleInstrument   {
    public Trombone(int playCount, int interval) {
        super(playCount, interval);
    }

    @Override
    public void play() {
        System.out.println("Bom bom booom");

    }
}
