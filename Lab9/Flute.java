package com.company;

public class Flute extends SingleInstrument  {

    public Flute(int playCount, int interval) {
        super(playCount, interval);
    }

    @Override
    public void play() {
        System.out.println("Fluuuu flu fluu");

    }
}
