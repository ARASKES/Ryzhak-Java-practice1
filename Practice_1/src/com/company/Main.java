package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException
    {
        while (true)
        {
            CallUI();

            Scanner input = new Scanner(System.in);

            switch (input.nextLine())
            {
                case "1":
                    Task_1.Execute(input);
                    break;
                case "2":
                    Task_2.Execute(input);
                    break;
                case "3":
                    Task_3.Execute(input);
                    break;
                case "4":
                    Task_4.Execute(input);
                    break;
                case "5":
                    Task_5.Execute(input);
                    break;
                case "6":
                    Task_6.Execute(input);
                    break;
                case "7":
                    Additional_1.Execute(input);
                    break;
                case "8":
                    Additional_2.Execute(input);
                    break;
                case "9":
                    Additional_3.Execute(input);
                    break;
                case "10":
                    Additional_4.Execute(input);
                    break;
                case "exit":
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong input received! Try again");
                    break;
            }

            WaitKey();
        }
    }

    static void CallUI()
    {
        System.out.println("\nChoose the task to execute:\n");
        for (int i = 0; i < 6; i++)
        {
            System.out.printf("%d. Task %d\n", i + 1, i + 1);
        }
        for (int i = 6; i < 10; i++)
        {
            System.out.printf("%d. Additional task %d\n", i + 1, i - 5);
        }
        System.out.print("\t\t\texit - close the program\n> ");
    }

    static void WaitKey() throws IOException
    {
        System.out.println("\nPress Enter to continue...");
        System.in.read();
        System.out.println();
    }
}