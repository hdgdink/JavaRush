package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];
        for (int i=0;i<list.length;i++)
        {
            int s = Integer.parseInt(reader.readLine());
            list[i]=s;
        }
        return list;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int m=array[0];
        for (int i=0;i<array.length;i++)
            if (m<array[i]) m = array[i];
        return m;
    }
}
