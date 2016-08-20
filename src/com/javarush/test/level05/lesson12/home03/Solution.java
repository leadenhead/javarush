package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Mouse jorikMouse = new Mouse("Jorik", 15 , 7);
        Mouse jmurikMouse = new Mouse("Jmurik", 0 , 0);
        Cat tomCat = new Cat("Tom", 12 , 5);
        Cat oggyCat = new Cat("Oggy", 12 , 5);
        Cat catdogCat = new Cat("Catdog", 12 , 5);
        Dog plutoDog = new Dog("pluto", 12 , 5);
        Dog dog2Dog = new Dog("dog2", 12 , 5);
        Dog dog3Dog = new Dog("dog3", 12 , 5);
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //добавьте тут ваши классы
    public static class Dog
    {
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat
    {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
}
