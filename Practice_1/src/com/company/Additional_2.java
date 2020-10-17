package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Additional_2
{
    public static void Execute(Scanner input)
    {
        new LetterCounter(input).ShowUnique();
    }
}

class LetterCounter
{
    static String[] text = new String[10];

    public LetterCounter(Scanner input)
    {
        System.out.println("Write 10 lines of text:");
        for (int i = 0; i < 10; i++)
        {
            text[i] = input.nextLine();
        }
    }

    void ShowUnique()
    {
        ArrayList<Character> uniqueLetters = new ArrayList<>();

        System.out.print("Unique letters in text: ");

        for (String s : text)
        {
            for (char c : s.toCharArray())
            {
                if (!uniqueLetters.contains(c))
                {
                    uniqueLetters.add(c);
                }
            }
        }

        for (Character c : uniqueLetters)
        {
            System.out.print(c);
        }
        System.out.printf("\nUnique letters amount: %d", uniqueLetters.size());
    }
}