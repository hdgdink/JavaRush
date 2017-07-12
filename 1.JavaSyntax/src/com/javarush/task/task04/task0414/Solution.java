package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader year  = new BufferedReader(new InputStreamReader(System.in));
        String j = year.readLine();
        int x1=365,x2=366;
        int i = Integer.parseInt(j);
        if (((i%4==0) && (i%100!=0)) || ((i%400==0)&&(i%100==0)))
            System.out.println("количество дней в году: " + x2);
        else System.out.println("количество дней в году: " + x1);

    }
}