package com.company;

import java.util.ArrayList;
import java.util.List;

public class Orchestra extends SingleInstrument {

    private ArrayList<Instrument> instruments = new ArrayList<>();

    public Orchestra(int playCount, int interval) {
        super(playCount, interval);
    }


    @Override
    public void play() {
        List<Thread> threads =new ArrayList<>();
        for (Instrument instrument : instruments) {
          //  instrument.play();//ma tworzyc nowy watek i odpalac go
            Thread instrumentThread = new Thread(instrument);
            threads.add(instrumentThread);
            instrumentThread.start();
        }
        for(Thread thread:threads){
            try{
                thread.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("dziekujemy za uwage");

    }

    public void addInstrument(Instrument instrument) {
        instruments.add(instrument);

    }
    public static void main(String[] args){
        Orchestra zespol = new Orchestra(1,1);
        zespol.addInstrument(new Guitar(5,200));
        zespol.addInstrument(new Flute(20,100));
        zespol.addInstrument(new Trombone(10,300));
        zespol.play();

    }

}
