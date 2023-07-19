package ru.example.lesson5.task1.instruments;

import ru.example.lesson5.task1.Instruments;

public class Trumped extends Instrument implements Instruments {
    int sizeTube;

    public Trumped(int sizeTube) {
        this.sizeTube = sizeTube;
    }
    @Override
    public void play(){
        System.out.println("Играет труба диаметром "+ this.sizeTube);
    }
}
