package com.javarush.task.task08.task0801;

/* 
HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.HashSet;


public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashSet<String> flora = new HashSet<String>();
        flora.add("арбуз");
        flora.add("банан");
        flora.add("вишня");
        flora.add("груша");
        flora.add("дыня");
        flora.add("ежевика");
        flora.add("жень-шень");
        flora.add("земляника");
        flora.add("ирис");
        flora.add("картофель");

        for (String el : flora) {
            System.out.println(el);
        }


    }
}
