package com.company;

public abstract class SingleInstrument implements Instrument {

    private final int playCount;
    private final int interval;

    public SingleInstrument(int playCount, int interval) {
        this.playCount = playCount;
        this.interval = interval;
    }

    @Override
    public void run() {
        for (int i = 0; i < playCount; i++) {
            play();
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
