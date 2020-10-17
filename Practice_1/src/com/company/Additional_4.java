package com.company;

import java.util.Scanner;

public class Additional_4
{
    public static void Execute(Scanner input)
    {
        System.out.print("Input the date in format \"dd.mm\": ");
        String date = input.nextLine();

        System.out.printf("The date is odd: %b", isDateOdd(date));
    }

    static boolean isDateOdd(String date)
    {
        int daysPassed = 0, day = 0, month = 0;

        for (int i = 0; i < date.length(); i++)
        {
            if (i < date.length() - 1 && date.toCharArray()[i + 1] == '.')
            {
                day = Integer.parseInt(date.toCharArray()[i - 1] + Character.toString(date.toCharArray()[i]));
            }
            if (i > 0 && date.toCharArray()[i - 1] == '.')
            {
                month = Integer.parseInt(date.toCharArray()[i] + Character.toString(date.toCharArray()[i + 1]));
            }
        }

        daysPassed += day;
        month--;

        if (month > 0)
        {
            for (int i = 1; i <= month; i++)
            {
                if (i == 4 || i == 6 || i == 9 || i == 11)
                {
                    daysPassed += 30;
                }
                else if (i == 2)
                {
                    daysPassed += 28;
                }
                else
                {
                    daysPassed += 31;
                }
            }
        }

        return daysPassed % 2 == 1;
    }
}