package com.company;

public class Guitar extends SingleInstrument  {
    public Guitar(int playCount, int interval) {
        super(playCount, interval);
    }

    @Override
    public void play() {
        System.out.println("trym tram baaam"+ Thread.currentThread());

    }
}
