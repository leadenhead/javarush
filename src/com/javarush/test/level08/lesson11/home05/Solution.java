package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        //напишите тут ваш код

        String[] str = s.split(" ");
        for (String stroke:
                str) {
            stroke = firstCharacterToUpperCase(stroke);
            System.out.print(stroke);
            System.out.print(" ");
        }


    }

    public static String firstCharacterToUpperCase(String str)
    {
        String result;
        if (str == null || str.isEmpty()){
            result = "";
            return result;
        }
        else
        {
            return str.substring(0,1).toUpperCase() + str.substring(1);
        }
    }

}
