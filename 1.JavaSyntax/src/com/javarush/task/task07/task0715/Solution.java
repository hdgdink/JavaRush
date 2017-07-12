package com.javarush.task.task07.task0715;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        for (int i = 1; i <= list.size(); i++) {
            list.add(i++, "именно");
        }
        for (String item : list) {
            System.out.println(item);

        }
    }
}
