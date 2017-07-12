package com.javarush.task.task05.task0501;

/* 
Создание кота
*/

//import kotlin.reflect.jvm.internal.impl.descriptors.EffectiveVisibility;

public class Cat {
    //напишите тут ваш код
    public String name;
    public int age,weight,strength;

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = ("Bro");
        cat1.age = 14;
        cat1.weight = 50;
        cat1.strength = 115;
    }
}
