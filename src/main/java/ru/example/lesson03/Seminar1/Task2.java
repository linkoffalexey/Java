package ru.example.lesson03.Seminar1;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{2, 2, 2}, 4)));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 2, -1}, 4)));
        System.out.println(Arrays.toString(twoSum(new int[]{0, 0, 0}, 25)));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 2, 25}, 0)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, -5)));
        System.out.println(Arrays.toString(twoSum(new int[]{-15, -1, 3, 5, 7}, -10)));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 2, 2}, 4)));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 2, 2}, 4)));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 2, 2}, 4)));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 2, 2}, 4)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
