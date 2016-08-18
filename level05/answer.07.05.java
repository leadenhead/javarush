package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //напишите тут ваш код
    private int top = 0;
    private int left = 0;
    private int width = 0;
    private int height = 0;

    public void initialize(int t, int l, int w, int h)
    {
        this.top = t;
        this.left = l;
        this.width = w;
        this.height = h;
    }

    public void initialize(int t, int l)
    {
        this.top = t;
        this.left = l;
    }

    public void initialize(int t, int l, int h)
    {
        this.top = t;
        this.left = l;
        this.width = h;
        this.height = h;
    }

    public void initialize(Rectangle R)
    {
        this.top = R.top;
        this.left = R.left;
        this.width = R.width;
        this.height = R.height;
    }
}
