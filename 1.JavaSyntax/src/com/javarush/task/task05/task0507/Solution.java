package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
       double a,b=0;
               int c=0;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
       while (true) {
           a = Double.parseDouble(r.readLine());
           if (a == -1) {
               break;
           } else {
               b = b + a;
               c++;
           }
       }
        System.out.println(b/c);


    }
}

