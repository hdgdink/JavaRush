package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int n;
        int m;

        n=Integer.parseInt(reader.readLine());
        m=Integer.parseInt(reader.readLine());

        for (;list.size()<n;) list.add(reader.readLine());

        for (int i=0;i<m;i++){
            list.add(list.get(0));
            list.remove(list.get(0));
        }
        for (String item:list){
            System.out.println(item);
        }




        //напишите тут ваш код
    }
}
