package com.eight;

import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        System.out.println("Введите любое целое число");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
                System.out.println(sum);
            }
        }
    }
}