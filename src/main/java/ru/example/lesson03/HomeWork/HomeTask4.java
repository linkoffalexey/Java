package ru.example.lesson03.HomeWork;

public class HomeTask4 {
    public static void main(String[] args) {
        System.out.println(getPalindrome("1gg12"));
    }
    public static boolean getPalindrome(String str) {
        String str1 = new StringBuilder(str).reverse().toString();
        return str.equals(str1);
    }
}
