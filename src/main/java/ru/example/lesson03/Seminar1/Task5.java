package ru.example.lesson03.Seminar1;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
      divisorsCommonBigArrays(500,300);
        System.out.println(greatestCommonDivisor(500, 300));

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
        int i = 0;
        for (div = 1; div < num; div++) {
            if (num % div == 0) {
                divisors[i] = div;
                i++;
            }
        }

        return divisors;
    }

    public static int divisorsCommonBigArrays(int a, int b) {
        int[] divA = divisors(a);
        int[] divB = divisors(b);
        int div=0;
        System.out.println("Делители заданого числа: " + Arrays.toString(divA));
        System.out.println("Делители заданого числа: " + Arrays.toString(divB));
        for(int i=0;i<divA.length;i++){
            for (int j=0;j<divB.length;j++){
                if (divA[i]==divB[j]){
                    div = divA[i];
                }
            }
        }
        System.out.println(div);
        return div;
    }

    public static int greatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        return greatestCommonDivisor(b, a % b);


    }
}


