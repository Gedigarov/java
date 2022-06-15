package com.nine;

import java.util.Arrays;
import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        double x = 0;
        double y;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        double arr[] = new double[size];
         for (int i = 0; i < size; i++) {
        System.out.println("Что будет в индексе " +i + "?");
            arr[i] = input.nextDouble();
            x += arr[i];
        }
        y = x / size;
        for (int i = 0; i < size; i++) {
            arr[i] = arr[i] * y;
        }
                System.out.println(Arrays.toString(arr));

    }
}
