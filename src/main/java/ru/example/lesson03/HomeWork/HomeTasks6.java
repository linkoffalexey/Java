package ru.example.lesson03.HomeWork;

import java.util.Arrays;

public class HomeTasks6 {
    public static void main(String[] args) {
        int a1[] = new int[]{0, 5, 100};
        int a2[] = new int[]{-10, 2, 3, 4, 6, 7, 120};
        System.out.println(Arrays.toString(mergeArrays(a1, a2)));
        System.out.println(Arrays.toString(mergeArraysR(a2, a1)));
        System.out.println(Arrays.toString(merge(a1, a2)));
    }

    public static int[] merge(int[] foo, int[] bar) {

        int fooLength = foo.length;
        int barLength = bar.length;

        int[] merged = new int[fooLength + barLength];

        int fooPosition, barPosition, mergedPosition;
        fooPosition = barPosition = mergedPosition = 0;

        while (fooPosition < fooLength && barPosition < barLength) {
            if (foo[fooPosition] < bar[barPosition]) {
                merged[mergedPosition++] = foo[fooPosition++];
            } else {
                merged[mergedPosition++] = bar[barPosition++];
            }
        }

        while (fooPosition < fooLength) {
            merged[mergedPosition++] = foo[fooPosition++];
        }

        while (barPosition < barLength) {
            merged[mergedPosition++] = bar[barPosition++];
        }

        return merged;
    }

    public static int[] mergeArraysR(int[] sort1, int[] sort2) {

        int mergeSort[] = new int[sort1.length + sort2.length];
        int lengthSort1 = sort1.length;
        int lengthSort2 = sort2.length;
        int indexSort1, indexSort2, indexMerge;
        indexSort1 = indexSort2 = indexMerge = 0;
        while (indexSort1 < lengthSort1 && indexSort2 < lengthSort2) {
            if (sort1[indexSort1] < sort2[indexSort2]) {
                mergeSort[indexMerge] = sort1[indexSort1];
                indexMerge++;
                indexSort1++;

            } else {
                mergeSort[indexMerge++] = sort2[indexSort2++];
            }


        }
        while (indexSort1 < lengthSort1) {
            mergeSort[indexMerge++] = sort1[indexSort1++];

        }
        while (indexSort2 < lengthSort2) {
            mergeSort[indexMerge++] = sort2[indexSort2++];

        }


        return mergeSort;
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