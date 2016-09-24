package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Vlasov", "Serg");
        map.put("Bash", "Miha");
        map.put("Dolj", "Miha");
        map.put("Kovsh", "Super");
        map.put("Super", "Kovsh");
        map.put("Kovalsky", "Natalia");
        map.put("Febenchuk", "Fedor");
        map.put("Lampard", "Frank");
        map.put("Leo", "Messi");
        map.put("Ronaldo", "Chris");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<>(map);
        Iterator<Map.Entry<String, String>> itCopy = copy.entrySet().iterator();
        while (itCopy.hasNext()){
            Map.Entry<String, String> pairCopy = itCopy.next();
            String val = pairCopy.getValue();
            String k = pairCopy.getKey();
            boolean hasDuplicate = false;
            Iterator<Map.Entry<String, String>> itMap = map.entrySet().iterator();
            while(itMap.hasNext()){
                Map.Entry<String, String> pairMap = itMap.next();
                if (val.equals(pairMap.getValue()) && !k.equals(pairMap.getKey())) hasDuplicate = true;
            }
            if (hasDuplicate) removeItemFromMapByValue(map, val);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
