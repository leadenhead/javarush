package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        ArrayList<Human> forFatherAndMother = new ArrayList<Human>();
        Human children1 = new Human("Anton", true, 14, forFatherAndMother);
        Human children2 = new Human("Irina", false, 10, forFatherAndMother);
        Human children3 = new Human("Valera", true, 3, forFatherAndMother);

        forFatherAndMother.add(children1);
        forFatherAndMother.add(children2);
        forFatherAndMother.add(children3);

        Human father = new Human("Vlad", true, 35, forFatherAndMother);
        Human mother = new Human("Vika", false, 33, forFatherAndMother);

        ArrayList<Human> forGranniesOfFather = new ArrayList<Human>();
        forGranniesOfFather.add(father);
        ArrayList<Human> forGranniesOfMother = new ArrayList<Human>();
        forGranniesOfMother.add(mother);

        Human grandFatherOfFather = new Human("Bogdan", true, 68, forGranniesOfFather);
        Human grandMotherOfFather = new Human("Violetta", false, 65, forGranniesOfFather);

        Human grandFatherOfMother = new Human("Timofey", true, 72, forGranniesOfMother);
        Human grandMotherOfMother = new Human("Pamela", false, 70, forGranniesOfMother);

        System.out.println(grandFatherOfFather);
        System.out.println(grandFatherOfMother);
        System.out.println(grandMotherOfFather);
        System.out.println(grandMotherOfMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(children1);
        System.out.println(children2);
        System.out.println(children3);
    }

    public static class Human
    {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}

