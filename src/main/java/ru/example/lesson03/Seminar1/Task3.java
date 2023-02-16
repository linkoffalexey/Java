package ru.example.lesson03.Seminar1;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(exportSymbol("qwart", "rqwt"));
        System.out.println(exportSymbol("rqwt", "qwart"));
    }

    public static char getSymbol(String strBig, String strSmall) {
        for (int i = 0; i < strBig.length(); i++) {
            boolean isFound = false;
            for (int j = 0; j < strSmall.length(); j++) {
                if (strBig.charAt(i) == strSmall.charAt(j)) {
                    isFound = true;
                }
            }
            if (!isFound) {
                return strBig.charAt(i);
            }
        }
        return 'с';
    }

    public static char exportSymbol(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return getSymbol(str1, str2);
        } else {
            return getSymbol(str2, str1);
        }
    }
}
