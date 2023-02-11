package ru.example.lesson03.HomeWork;

import java.util.Scanner;

public class HomeTask5 {
    public static void main(String[] args) {
        System.out.println("Угадайте число от 0 до 100");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("Вы ввели число " + input);
        int in = Integer.parseInt(input);
        gameRandom(in);

    }

    public static void gameRandom(int input) {
        int random = (int) (Math.random() * 100);
        if (input > 100 || input < 0) {
            System.out.println("Введено некорректное число!");
        } else {
            if (input == random) {

                System.out.println("Угадал!");
            } else if (input > random) {
                System.out.println("Не угадал, число меньше введенного");
            } else {
                System.out.println("Не угадал, число больше введенного");
            }
        }
    }


}
