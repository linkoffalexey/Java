package ru.example.lesson03.HomeWork;

import java.util.Arrays;

public class HomeTasks6 {
    public static void main(String[] args) {
        int a1[] = new int[]{0, 5, 100};
        int a2[] = new int[]{-10, 2, 3, 4, 6, 7, 120};
        System.out.println(Arrays.toString(mergeArrays(a1, a2)));
        System.out.println(Arrays.toString(mergeArrays(a1, a2)));
    }


    public static int[] mergeArraysR(int[] a1, int[] a2) {
        int a[] = new int[a1.length + a2.length];
        int i = 0;
        if (a2.length > a1.length) {
            for (int j = 0; j < a1.length; j++) {
                for (i = 0; i < a2.length; i++) {
                    if (a2[j] > a1[i]) {
                        a[i] = a1[i];
                    } else if (a2[j + 1] < a1[i]) {
                        a[i] = a2[j + 1];
                    } else {
                        a[i] = a2[j];
                    }
                }
            }

        }
        return a;
    }


    public static int[] mergeArrays(int[] a1, int[] a2) {
        int a[] = new int[a1.length + a2.length];
        int i = 0;
        for (i = 0; i < a1.length; i++) {
            a[i] = a1[i];
        }
        for (int j = 0; j < a2.length; j++) {
            a[i] = a2[j];
            i++;
        }
        Arrays.sort(a);

        return a;
    }
}