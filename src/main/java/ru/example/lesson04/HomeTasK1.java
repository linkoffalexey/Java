package ru.example.lesson04;

class HomeTasK1 {
    public static void main(String[] args) {
        HomeTasK1 a = new HomeTasK1();
        //HomeTasK1 b = new HomeTasK1("Вася");

    }
    private String str;

    public HomeTasK1() {
        System.out.println("Вывожу сообщение на экран");
    }

    public HomeTasK1(String str) {
        this();
        this.str = str;
        System.out.println(str);

    }


}




