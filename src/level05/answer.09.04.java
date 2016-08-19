package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    //напишите тут ваш код
    private int centerX = 0;
    private int centerY = 0;
    private int radius = 0;
    private int width = 0;
    private String color = null;

    public Circle(int X, int Y, int R)
    {
        this.centerX = X;
        this.centerY = Y;
        this.radius = R;
    }

    public Circle(int X, int Y, int R, int W)
    {
        this.centerX = X;
        this.centerY = Y;
        this.radius = R;
        this.width = W;
    }

    public Circle(int X, int Y, int R, int W, String C)
    {
        this.centerX = X;
        this.centerY = Y;
        this.radius = R;
        this.width = W;
        this.color = C;
    }
}
