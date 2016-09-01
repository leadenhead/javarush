package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array_input = new int[20];
        int d;
        ArrayList<Integer> array_mod3 = new ArrayList<>();
        ArrayList<Integer> array_mod2 = new ArrayList<>();
        ArrayList<Integer> array_other = new ArrayList<>();

        for (int i = 0; i < array_input.length; i++)
            array_input[i] = Integer.parseInt(reader.readLine());

        for (int i = 0; i < array_input.length; i++) {
            d = array_input[i];

            if (d % 2 == 0) {
                array_mod2.add(d);
                if (d % 3 == 0)
                    array_mod3.add(d);
            }
            else if (d % 3 == 0)
                array_mod3.add(d);
            else
                array_other.add(d);
        }
        printList(array_mod3);
        printList(array_mod2);
        printList(array_other);
    }

    public static void printList(List<Integer> list)
    {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
