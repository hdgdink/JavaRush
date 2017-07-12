package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    private int  left, top, width, height;

    public void initialize(int left,int top,int width,int height){
        this.left = 5;
        this.top = 5;
        this.width = 45;
        this.height = 65;
    }
    public void initialize(int left,int top){
        this.left = 5;
        this.top = 5;
        this.width = width;
        this.height = height;
    }
    public void initialize(int left,int top,int width){
        this.left = 5;
        this.top = 5;
        this.width = width;
    }
    public void initialize(){
        Rectangle rectangle = new Rectangle();
    }


    public static void main(String[] args) {

    }
}
