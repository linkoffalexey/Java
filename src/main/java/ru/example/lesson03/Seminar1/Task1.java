package ru.example.lesson03.Seminar1;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(booleanExpression(true, true, true, true));
        System.out.println(booleanExpression(true, true, true, false));
        System.out.println(booleanExpression(true, true, false, true));
        System.out.println(booleanExpression(true, false, false, false));
        System.out.println(booleanExpression(true, false, true, false));
        System.out.println(booleanExpression(false, false, false, false));
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        var count = 0;
        if (a) {
            count++;
        }
        if (b) {
            count++;
        }
        if (c) {
            count++;
        }
        if (d) {
            count++;
        }

        return count == 2;
    }

    public static int countUpperLetters(String str) {
        if (str == null) {
            return 0;
        }
        var count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.toUpperCase().charAt(i)) {
                count++;
            }
        }
        return count;
    }
}

