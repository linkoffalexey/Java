package ru.example.lesson03.HomeWork;

public class HomeTask3 {
    public static void main(String[] args) {
        System.out.println(getFibonacciNumber(12));
    }
    public static int getFibonacciNumber(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);

    }

}
