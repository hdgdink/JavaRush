package com.javarush.task.task07.task0706;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение — число жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными — на другой. Выяснить, на какой стороне улицы проживает больше жителей.
4. Вывеси на экран сообщение: «В домах с нечетными номерами проживает больше жителей.» или «В домах с четными номерами проживает больше жителей.»
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] list = new int[15];
        int ch=0;
        int nech=0;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<list.length; i++){
            list[i]= Integer.parseInt(r.readLine());
            if (i%2==0)  ch=ch+list[i];
            else nech=nech+list[i];
        }
        if (ch>nech) System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");

    }
}
