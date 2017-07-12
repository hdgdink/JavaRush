package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int c;
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        c= Integer.parseInt(read.readLine());
        for (;c>0;c=(c/10)){
        if (c%2==0) even++;
        else odd++;
       }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
