package com.company;

import java.util.Scanner;

public class Task_5
{
    public static void Execute(Scanner input)
    {
        int year;
        do
        {
            System.out.print("Input the year: ");
            year = input.nextInt();
        }
        while (year < 1000 || year > 9000);

        do
        {
            year++;
        }
        while (!DigitsAreDifferent(year));

        System.out.printf("Appropriate year: %d", year);
    }

    static boolean DigitsAreDifferent(int number)
    {
        for (int lastDigit = number % 10; number / 10 > 0; number /= 10, lastDigit = number % 10)
        {
            int internalNumber = number;
            while (internalNumber / 10 != 0)
            {
                if (lastDigit == (internalNumber / 10) % 10)
                {
                    return false;
                }
                internalNumber /= 10;
            }
        }
        return true;
    }
}