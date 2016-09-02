package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
            array[i] = Integer.parseInt(reader.readLine());

        sort(array);

        for (int i = 0; i < array.length; i++)
            System.out.println(array[array.length - i - 1]);
    }

    public static void sort(int[] array)
    {
        //напишите тут ваш код
        boolean flag = true;
        ArrayList<Boolean> check = new ArrayList<>();

        while (flag) {
            for (int i=0, j=1; j < array.length; i++, j++) {
                int I = array[i];
                int J = array[j];

                if (I > J) {
                    array[j] = I;
                    array[i] = J;
                    check.add(false);
                }
                else {
                    check.add(true);
                }
            }
            flag = check.contains(false) ? true : false;
            check.clear();
        }
    }
}
