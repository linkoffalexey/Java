package ru.example.lesson5.task2.shape;

public class Main {
    public static void printArea (Shape shape){
        System.out.println(shape.area());
    }

    public static void main(String[] args) {
        Circle circleBig = new Circle(7);
        Rectangle rectangle1 = new Rectangle(2,3);
        Square square1= new Square(4);
        printArea(circleBig);
        printArea(rectangle1);
        printArea(square1);
    }
}
