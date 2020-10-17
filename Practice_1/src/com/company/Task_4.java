package com.company;

import java.util.Scanner;

public class Task_4
{
    public static void Execute(Scanner input)
    {
        System.out.print("Input the number: ");
        int numb;
        numb = input.nextInt();

        System.out.printf("%d! = %d", numb, Factorial(numb));
    }

    static int Factorial(int argument)
    {
        if (argument == 0 || argument == 1)
        {
            return 1;
        }
        else
        {
            return argument * Factorial(argument - 1);
        }
    }
}