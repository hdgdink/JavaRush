package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution { public static void main(String[] args) throws Exception { int[] bigArray = new int[20]; int[] a1 = new int[10]; int[] a2 = new int[10]; BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); for (int i = 0; i < 20; i++) { bigArray[i]=Integer.parseInt(reader.readLine()); } for (int i = 0; i < 10; i++) { a1[i]=bigArray[i]; a2[i]=bigArray[i+10]; System.out.println(a2[i]); } } }
