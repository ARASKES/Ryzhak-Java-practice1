package com.company;

import java.util.Scanner;

public class Task_2
{
    public static void Execute(Scanner input)
    {
        int N;

        do
        {
            System.out.print("Input the number of month: ");
            N = input.nextInt();
        }
        while (N > 100);

        if (N == 1 || N == 2 || N == 12)
        {
            System.out.println("Winter");
        }
        else if (N >= 3 && N <= 5)
        {
            System.out.println("Spring");
        }
        else if (N >= 6 && N <= 8)
        {
            System.out.println("Summer");
        }
        else if (N >= 9 && N <= 11)
        {
            System.out.println("Autumn");
        }
        else
        {
            System.out.println("Error");
        }
    }
}
