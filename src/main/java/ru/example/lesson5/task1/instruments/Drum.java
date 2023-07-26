package ru.example.lesson5.task1.instruments;

import ru.example.lesson5.task1.Instrument;

public class Drum implements Instrument {
    String sizeNumber;

    public Drum(String sizeNumber) {
        this.sizeNumber = sizeNumber;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан номер " + this.sizeNumber);
    }


}

