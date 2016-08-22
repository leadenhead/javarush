package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(reader.readLine());

        System.out.println(mid(arr));
    }

    static int mid (int[] array) {
        int m;

        if (array[0] < array[1] && array[0] > array[2])
            m = array[0];
        else if (array[1] < array[0] && array[1] > array[2])
            m = array[1];
        else
            m = array[2];

        return m;
    }
}
