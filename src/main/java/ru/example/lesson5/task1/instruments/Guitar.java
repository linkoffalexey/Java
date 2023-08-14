package ru.example.lesson5.task1.instruments;

import ru.example.lesson5.task1.Instrument;

public class Guitar implements Instrument {

    int quantityStrings;

    public Guitar(int quantityStrings) {
        this.quantityStrings = quantityStrings;
    }


    @Override
    public void play() {
        Trumped tt = new Trumped(10);
        tt.sizeTube=20;
        System.out.println("Играет гитара c количеством струн " + this.quantityStrings);

    }
}
