package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int more;
        int d;
        more = d = Integer.parseInt(reader.readLine());

        //напишите тут ваш код
        for (; count > 1; count--)
        {
            d = Integer.parseInt(reader.readLine());
            more = d > more ? d : more;
        }

        System.out.println(more);
    }
}
