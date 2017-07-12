package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* 
Играем в Jолушку
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> tri = new ArrayList<>();
        ArrayList<Integer> dva = new ArrayList<>();
        ArrayList<Integer> vse = new ArrayList<>();

        for (int i=0;i<20;i++){
            list.add(Integer.parseInt(r.readLine()));
            if (list.get(i)%3==0 && list.get(i)%2==0){
                tri.add(list.get(i));
                dva.add(list.get(i));
            } else
            if (list.get(i)%3==0) tri.add(list.get(i));
            else
                if (list.get(i)%2==0) dva.add(list.get(i));
                else vse.add(list.get(i));
        }
        printList(tri);
        printList(dva);
        printList(vse);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int item:list){
            System.out.println(item);
        }

    }
}
