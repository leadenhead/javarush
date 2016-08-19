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
        // int maximum = ;
        int N = Integer.parseInt(reader.readLine());
        int[] arr = new int[N];

        //напишите тут ваш код
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(reader.readLine());

        int maximum = compare(arr);

        System.out.println(maximum);
    }

    static int compare(int[] array) {
        int max = 0;

        for (int i = 0; i < array.length; i++)
            if (array[max] < array[i])
                    max = i;

        return array[max];
    }
}
