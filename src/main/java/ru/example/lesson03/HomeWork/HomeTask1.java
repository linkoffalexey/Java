package ru.example.lesson03.HomeWork;

public class HomeTask1 {
    public static void main(String[] args) {

        int[] a = new int[]{1, 10, 20, -10, 18};
        int[] b = new int[]{-1, -10, -20, -10, -18};
        System.out.println(getMaxMassive(b));
        System.out.println(getMinMassive(b));
        System.out.println(getSumMassive(b));
        System.out.println(getMaxMassive(a));
        System.out.println(getMinMassive(a));
        System.out.println(getSumMassive(a));
    }

    public static int getMaxMassive(int[] mass) {
        int i = 0;
        int max = mass[i];
        for (i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        return max;
    }

    public static int getMinMassive(int[] mass) {
        int i = 0;
        int min = mass[i];
        for (i = 0; i < mass.length; i++) {
            if (mass[i] < min) {
                min = mass[i];
            }
        }
        return min;
    }

    public static int getSumMassive(int[] mass) {
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            sum = sum + mass[i];
        }
        return sum;
    }

}




