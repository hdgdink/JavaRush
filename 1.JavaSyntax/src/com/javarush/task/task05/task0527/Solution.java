package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog ClinDog = new Dog("Clin",12,13);
        Cat TomCat = new Cat("Tom","blue",12);

        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Dog{
        String name;
        int age;
        int tail;
        public Dog (String name,int age, int tail){
            this.name = name;
            this.age = age;
            this.tail=tail;
        }
    }
    public static class Cat{
        String name;
        String color;
        int age;
              public Cat (String name,String color,int age){
            this.name = name;
            this.color=color;
            this.age   =age;
            }
    }

    //напишите тут ваш код
}
