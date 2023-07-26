package ru.example.lesson5.task1;

import ru.example.lesson5.task1.instruments.*;


public class Main {

    public static void playInstruments(Instrument[] instruments) {
        for (int i = 0; i < instruments.length; i++) {
            Instrument play = instruments[i];
            play.play();

        }
    }

    public static void playInstrumentsOne(Instrument instruments) {
        instruments.play();

    }

    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[]{
                new Drum("8а"), new Guitar(7), new Trumped(10), new Drum("10")
        };
        playInstruments(instruments);
        playInstrumentsOne(new Trumped(10));
    }
}
