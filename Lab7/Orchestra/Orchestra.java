package com.company;

import java.util.ArrayList;

public class Orchestra implements Instrument {

    private ArrayList<Instrument> instruments = new ArrayList<>();


    @Override
    public void play() {
        for (Instrument instrument : instruments) {
            instrument.play();
        }

    }

    public void addInstrument(Instrument instrument) {
        instruments.add(instrument);

    }

}
