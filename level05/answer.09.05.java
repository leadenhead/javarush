package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
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

    public Rectangle(int T, int L, int W, int H)
    {
        this.top = T;
        this.left = L;
        this.width = W;
        this.height = H;
    }

    public Rectangle(int T, int L)
    {
        this.top = T;
        this.left = L;
    }

    public Rectangle(int T, int L, int W)
    {
        this.top = T;
        this.left = L;
        this.width = W;
        this.height = W;
    }

    public Rectangle(Rectangle R)
    {
        this.top = R.top;
        this.left = R.left;
        this.width = R.width;
        this.height = R.height;
    }
}
