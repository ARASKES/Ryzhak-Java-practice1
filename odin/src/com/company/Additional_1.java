package com.company;

import java.util.Scanner;

public class Additional_1
{
    public static void Execute(Scanner input)
    {
        System.out.println("Point 1:");
        Point point1 = new Point(input.nextDouble(), input.nextDouble());
        System.out.println("Point 2:");
        Point point2 = new Point(input.nextDouble(), input.nextDouble());

        System.out.printf("%f", GetDistance(point1, point2));
    }

    static double GetDistance(Point p1, Point p2)
    {
        return Math.sqrt(Math.pow(p1.GetX() - p2.GetX(), 2) + Math.pow(p1.GetY() - p2.GetY(), 2));
    }
}

class Point
{
    private double x, y;

    public Point (double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double GetX()
    {
        return x;
    }

    public double GetY()
    {
        return y;
    }
}