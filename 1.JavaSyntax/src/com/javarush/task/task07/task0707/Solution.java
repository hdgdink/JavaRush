package com.javarush.task.task07.task0707;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList(5);
        list.add("number 1");
        list.add("number 2");
        list.add("number 3");
        list.add("number 4");
        list.add("number 5");


            System.out.println(list.size());


        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
