package ru.example.lesson04;



class Person {
    public static void main(String[] args) {
        Person a = new Person("Вася");
        Person b = new Person("Piter", 25);
        a.talk("I am Vasiliy");
        b.talk("I am from Detroit");
        b.move("Moscow");
    }
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void talk(String speech){
        System.out.println( name + " says:"+ speech);
    }

    public void move(String destination){
        System.out.println(name + " move to:"+ destination);
    }}


