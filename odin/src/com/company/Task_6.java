package com.company;

import java.util.Scanner;

public class Task_6
{
    public static void Execute(Scanner input)
    {
        System.out.print("Input the number of Fibonacci row elements to output: ");
        int quantity = input.nextInt();

        OutputFibonacci(quantity);
    }

    static void OutputFibonacci(int quantity)
    {
        int fElement = 0, sElement = 1;
        for (int i = 1; i <= quantity; i++)
        {
            if (i != 1)
            {
                int temp = fElement;
                fElement = sElement;
                sElement += temp;
            }
            System.out.printf("%d ", sElement);
        }
    }
}