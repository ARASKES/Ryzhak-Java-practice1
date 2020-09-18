package com.company;

import java.util.Scanner;

public class Task_3
{
    public static void Execute(Scanner input)
    {
        System.out.print("Input the number: ");
        int N = input.nextInt();

        while (N / 2 > 0)
        {
            if (N % 2 == 1)
            {
                System.out.println("NO NO NO");
                break;
            }

            if (N == 2)
            {
                System.out.println("YES YES YES");
            }

            N /= 2;
        }
    }
}