package com.javarush.test.level08.lesson08.task04;

import java.util.*;
import java.util.Date;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        long msDay = 24 * 60 * 60 * 1000;
        for (int i = 0; i < 9; i++) {
            map.put("Lastname" + (i + 1), new Date("JUNE 1 1980" + (msDay * 30 * (i+1))));
        }

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String,Date> pair = iterator.next();
            int month = pair.getValue().getMonth();
            if (month > 4 && month < 8) iterator.remove();
        }

    }
}
