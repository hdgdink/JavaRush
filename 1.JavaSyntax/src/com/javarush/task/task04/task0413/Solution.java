package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s  = reader.readLine();

        int i = Integer.parseInt(s);
        if (i==1) System.out.println("Понедельник");
        if (i==2) System.out.println("Вторник");
        if (i==3) System.out.println("Среда");
        if (i==4) System.out.println("Четверг");
        if (i==5) System.out.println("Пятница");
        if (i==6) System.out.println("Суббота");
        if (i==7) System.out.println("Воскресенье");
        if (i < 1 || i > 7) System.out.println("Такого дня недели не существует");
    }
}