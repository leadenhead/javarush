package com.javarush.test.level08.lesson11.home09;

import java.util.*;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        String test = new String("JANUARY 2 2020");
        System.out.println(isDateOdd(test));
    }

    public static boolean isDateOdd(String date)
    {
        String[] str = date.split(" ");
        int month = 0;
        String[] monthAll = {"JANUARY", "FEBRUARY", "MARCH", "APRIL",
                "MAY", "JUNE", "JULY", "AUGUST",
                "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
        for (int i = 0; i < monthAll.length; i++) {
            if (monthAll[i].equals(str[0])){
                month = i;
                break;
            }
        }
        int year = Integer.parseInt(str[2]);
        int day = Integer.parseInt(str[1]);

        Date checkDate = new Date();
        checkDate.setDate(day);
        checkDate.setMonth(month);
        checkDate.setYear(year);

        Date yearStartTime = new Date();
        yearStartTime.setSeconds(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setHours(0);
        yearStartTime.setDate(1);
        yearStartTime.setMonth(0);
        yearStartTime.setYear(year);

        long msDay = 24 * 60 * 60 * 1000;
        long msTimeDistance = checkDate.getTime() - yearStartTime.getTime();

        int dayCount = (int) (msTimeDistance/msDay);

        if ((dayCount % 2) == 0) return true;
        else return false;
    }
}

