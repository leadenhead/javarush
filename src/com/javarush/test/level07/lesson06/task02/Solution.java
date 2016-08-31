package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();
        int max = 0;
        int len;

        // наполняем список входящими значениями
        for (int i = 0; i < 5; i++)
            list.add(reader.readLine());

        // определяем длину самой длинной строки в списке
        for (int i = 0; i < list.size(); i++) {
            len = list.get(i).length();
            max = len > max ? len : max;
        }

        // проверяем, есть ли строки одинаковой длины с максимальной и добавляем их все в список
        for (int i = 0; i < list.size(); i++) {
            len = list.get(i).length();
            if (len == max)
                index.add(i);
        }

        for (int i = 0; i < index.size(); i++)
            System.out.println(list.get(index.get(i)));
    }
}
