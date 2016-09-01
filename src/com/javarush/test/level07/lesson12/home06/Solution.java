package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        ArrayList<Human> family = new ArrayList<>();

        Human grandmother1 = new Human();
        grandmother1.name = "Марфа";
        grandmother1.age = 87;
        family.add(grandmother1);

        Human grandfather1 = new Human();
        grandfather1.name = "Иван";
        grandfather1.age = 91;
        family.add(grandfather1);

        Human grandmother2 = new Human();
        grandmother2.name = "Матрёна";
        grandmother2.age = 79;
        family.add(grandmother2);

        Human grandfather2 = new Human();
        grandfather2.name = "Анисий";
        grandfather2.age = 84;
        family.add(grandfather2);

        Human mother = new Human();
        mother.name = "Валя";
        mother.age = 45;
        mother.mother = grandmother1;
        mother.father = grandfather1;
        family.add(mother);

        Human father = new Human();
        father.name = "Рома";
        father.age = 49;
        father.mother = grandmother2;
        father.father = grandfather2;
        family.add(father);

        Human children1 = new Human();
        children1.name = "Саша";
        children1.age = 30;
        children1.mother = mother;
        children1.father = father;
        family.add(children1);

        Human children2 = new Human();
        children2.name = "Дима";
        children2.age = 28;
        children2.mother = mother;
        children2.father = father;
        family.add(children2);

        Human children3 = new Human();
        children3.name = "Катя";
        children3.age = 26;
        children3.mother = mother;
        children3.father = father;
        family.add(children3);

        for (Human h : family)
            System.out.println(h.toString());
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
