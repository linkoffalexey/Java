package ru.example.lesson03.Seminar1;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Делители заданого числа: " + Arrays.toString(divisors(567)));


    }


    public static int[] divisors(int num) {
        int div = 0;
        int quantity = 0;
        for (div = 1; div < num; div++) {
            if (num % div == 0) {
                quantity++;
            }
        }
        int divisors[] = new int[quantity];
        System.out.println("Количество делителей: " + quantity);
        int i = 0;
        for (div = 1; div < num; div++) {
            if (num % div == 0) {
                divisors[i] = div;
                i++;

            }
        }
        System.out.println("Сумма делителей заданного числа: " + getSumMassive(divisors));
        return divisors;
    }

    public static int getSumMassive(int[] mass) {
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            sum = sum + mass[i];
        }
        return sum;
    }
}



