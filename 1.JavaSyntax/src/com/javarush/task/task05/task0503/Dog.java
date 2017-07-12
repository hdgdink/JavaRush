package com.javarush.task.task05.task0503;


/* 
Геттеры и сеттеры для класса Dog
*/

public class Dog {
    //напишите тут ваш код
    public String name;
    public int age;
    public void setName (String UserName){
        name = UserName;
    }
    public String getName(){
        return name;
    }
    public void setAge (int Userage){
        age = Userage;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {

    }
}
