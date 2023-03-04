package ru.example.lesson03.HomeWork;

import java.util.Arrays;

public class HomeTasks6 {
    public static void main(String[] args) {
       int a1[] = new int []{0, 5, 100};
       int a2[] = new int []{-10, 2, 3, 4, 6, 7, 120};
        System.out.println(Arrays.toString(mergeArrays(a1, a2)));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int a[] = new int[a1.length + a2.length];
        int i = 0;
        for (i = 0; i < a1.length; i++) {
            a[i] = a1[i];
        }
        for (int j=0; j<a2.length;j++){
            a[i]=a2[j];
            i++;
        }
         Arrays.sort(a);
        return a;
    }
}
