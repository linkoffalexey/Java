package ru.example.lesson5.task1.instruments;

import ru.example.lesson5.task1.Instruments;

public class Drum extends Instrument implements Instruments {
    String sizeNumber;

    public Drum(String sizeNumber) {
        this.sizeNumber = sizeNumber;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан номер " + this.sizeNumber);
    }


}

