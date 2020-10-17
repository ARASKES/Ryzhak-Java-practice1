package com.company;

import java.util.*;

public class Additional_3
{
    public static void Execute(Scanner input)
    {
        ArrayList<String> words = new ArrayList<>();
        Map<String, Integer> wordDictionary = new HashMap<>();

        System.out.println("Input 20 words:");
        for (int i = 0; i < 20; i++)
        {
            words.add(input.nextLine());
        }

        ArrayList<String> uniqueWords = new ArrayList<>();
        for (String word : words)
        {
            int wordRepetitions = 0;
            for (String w : words)
            {
                if (word.equals(w))
                {
                    wordRepetitions++;
                }
            }

            if (!uniqueWords.contains(word))
            {
                uniqueWords.add(word);
                wordDictionary.put(word, wordRepetitions);
            }
        }

        for (Map.Entry<String, Integer> entry : wordDictionary.entrySet())
        {
            System.out.printf("%s %d\n", entry.getKey(), entry.getValue());
        }
    }
}