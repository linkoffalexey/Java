package ru.example.lesson5.task2.shape;

public class Circle implements Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override

    public double area() {

    return radius * radius * Math.PI;

    }

}
