package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i<10;i++){
            list.add(r.readLine());
        }
        int max = 0;
        int min = 0;

        for (int i=0;i<10;i++){
            if (list.get(i).length()>list.get(max).length()) {
                max = i;
                            }
            if (list.get(i).length()<list.get(min).length()){
                min = i;
                }

        }
            String s = min<max ? list.get(min):list.get(max);
            System.out.println(s);
                    }
    }

