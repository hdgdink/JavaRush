package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;



/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String S = null;
        int i,a=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        while (true){
            S=reader.readLine();
            if (!S.equals("сумма")){
            i=Integer.parseInt(S);
            a=a+i;
            }
            else {
                System.out.println(a);
                break;
            }
        }
    }
}
