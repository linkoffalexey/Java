package ru.example.lesson02.doubleExpression;

public class DoubleExpression {
    public static void main(String[] args) {
        System.out.println(doubleExpression(0.1, 0.2, 0.3));
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) <= 0.0001;
    }
}
