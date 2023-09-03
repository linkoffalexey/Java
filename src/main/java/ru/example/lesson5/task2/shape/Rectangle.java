package ru.example.lesson5.task2.shape;

public class Rectangle implements Shape{

    double lengthSide;
    double widthSide;

    public Rectangle(double lengthSide, double widthSide){
        this.lengthSide=lengthSide;
        this.widthSide=widthSide;
    }


    @Override
    public double area() {
        return lengthSide*widthSide;
    }
}
