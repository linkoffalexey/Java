package ru.example.lesson5.task1.instruments;

import ru.example.lesson5.task1.Instruments;

public class Guitar extends Instrument implements Instruments {

    int quantityStrings;

    public Guitar(int quantityStrings) {
        this.quantityStrings = quantityStrings;
    }


    @Override
    public void play() {
        System.out.println("Играет гитара c количеством струн " + this.quantityStrings);

    }
}
