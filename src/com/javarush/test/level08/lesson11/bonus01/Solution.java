package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String month = input;
        month = month.toUpperCase();

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(0,"JANUARY");
        map.put(1,"FEBRUARY");
        map.put(2,"MARCH");
        map.put(3,"APRIL");
        map.put(4,"MAY");
        map.put(5,"JUNE");
        map.put(6,"JULY");
        map.put(7,"AUGUST");
        map.put(8,"SEPTEMBER");
        map.put(9,"OCTOBER");
        map.put(10,"NOVEMBER");
        map.put(11,"DECEMBER");

        int result = -1;
        for (Map.Entry<Integer,String> pair:
                map.entrySet()) {
            if (pair.getValue().equals(month)){
                result = pair.getKey();
                break;
            }
        }

        if (result != -1) System.out.println(input + " is " + (result+1) + " month");

    }

}
