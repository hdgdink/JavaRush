package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    private String name = null, color = "Grey", address = null;
    private int age = 11, weight = 45;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public void initialize(String color, String adress, int weight) {
        this.color = color;
        this.weight = weight;
        this.address = adress;
    }







    public static void main(String[] args) {

    }
}
