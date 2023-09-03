package ru.example.lesson5.task2.shape;

public class Square implements Shape{
    double lengthSide;

    public Square(double lengthSide){
        this.lengthSide=lengthSide;

    }
    @Override
    public double area(){
        return lengthSide*lengthSide;
    }
}
