package ru.example.lesson04;

class PrintP {
    private String str;

    public PrintP() {
        System.out.println("Вывожу сообзение на экран");
    }

    public PrintP(String str) {
        this.str = str;
        System.out.println("Вывожу сообзение на экран");
        System.out.println(str);

    }


}


public class HomeTask1 {
    public static void main(String[] args) {
        PrintP a = new PrintP();
        PrintP b = new PrintP("Вася");

    }
}
