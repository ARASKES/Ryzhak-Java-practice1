package com.company;

import java.util.Scanner;

public class Task_1
{
    public static void Execute(Scanner input)
    {
        System.out.print("Input the array size: ");
        int size = input.nextInt();
        double[] arr = new double[size];

        System.out.println("Array contents:");
        for (int i = 0; i < size; i++)
        {
            arr[i] = Math.random() * 20;
            System.out.printf("%f ", arr[i]);
        }
        System.out.println();

        double max = 0, min = 20, average = 0;
        for (int i = 0; i < size; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
            if (arr[i] < min)
            {
                min = arr[i];
            }
            average += arr[i];
        }
        average /= size;

        System.out.printf("Max value: %f\nMin value: %f\nAverage value: %f", max, min, average);
    }
}