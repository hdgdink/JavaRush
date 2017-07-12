package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] as = new int[20];
        int maximum;
        int minimum;

        for (int i = 0; i < as.length; i++) {
            as[i] = Integer.parseInt(reader.readLine());
        }
        maximum = as[0];
        minimum = as[0];
        for (int i = 0; i < as.length; i++) {
            if (as[i] > maximum)
                maximum = as[i];
            if (as[i] < minimum)
                minimum = as[i];
        }

        System.out.println(maximum + " " + minimum);
    }
}





