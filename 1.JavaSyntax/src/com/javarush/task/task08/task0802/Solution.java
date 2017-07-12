package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз — ягода,
банан — трава,
вишня — ягода,
груша — фрукт,
дыня — овощ,
ежевика — куст,
жень-шень — корень,
земляника — ягода,
ирис — цветок,
картофель — клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashMap<String,String> map = new HashMap<>();
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        for (Map.Entry<String,String> pair : map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }

        // map.forEach((k, v) -> System.out.println(k + " — " + v));

    }
}
