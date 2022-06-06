package com.seven;

import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        final int x, y, z;
        x = 4;
        y = 5;
        z = 8;

        boolean flag = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        int arr[] = new int[size];
        System.out.println("Введите числа:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
            if (arr[i] == x | arr[i] == y | arr[i] == z)
                flag = true;
        }
        if (flag) System.out.println("Данное значение имеется в константах");
    }
}
