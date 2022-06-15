package com.ten;

import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Razmer massiva X");
        int x = scann.nextInt();
        System.out.println("Razmer Massiva Y");
        int y = scann.nextInt();
        int[][] arr = new int[x][y];

        for (int i = 0; i < x; i++) {
            System.out.println("Vvedite chisla v razmere " + y + " cherez probel");
            for (int j = 0; j < y; j++) {
                arr[i][j] = scann.nextInt();
            }
        }
        System.out.println("\nPervaia strochka massiva umnojennaia 3 :");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] *= 3;

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
