package ru.example.lesson5.task3;

import java.math.BigDecimal;

public class Money {
    int ruble;
    int copeck;
    int money;

    public Money(int ruble, int copeck) {
        this.ruble = ruble;
        this.copeck = copeck;
        this.money = ruble * 100 + copeck;
    }

    public Money plus(Money otherMoney) {
        int money;
        money = this.money + otherMoney.money;
        Money summ = new Money(money / 100, money % 100);
        return summ;
    }

    public Money minus(Money otherMoney) {
        int money;
        money = this.money - otherMoney.money;
        Money difference = new Money(money / 100, money % 100);
        return difference;
    }

    public Money multiply(int multiplier) {
        int money;
        money = this.money * multiplier;
        Money result = new Money(money / 100, money % 100);
        return result;
    }

    public void print(){
        System.out.println("ruble=" + ruble  + " " + "copeck=" + copeck);
    };

    public static void main(String[] args) {
        Money m1 = new Money(1, 30);
        Money m2 = new Money(2, 90);
        Money m3 = m1.plus(m2);
        Money m4 = m3.minus(m1);
        Money m5 = m1.multiply(2);
        m1.print();
        m2.print();
        m3.print();
        m4.print();
        m5.print();
    }
}
