package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String r = "0";
        int summ = 0;

        while (!r.equals("сумма"))
        {
            summ += Integer.parseInt(r);
            r = reader.readLine();
        }

        System.out.println(summ);
    }
}
