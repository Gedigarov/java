package com.five;

import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите число X");
        int num1 = vvod.nextInt();

        System.out.println("Введите число Y");
        int num2 = vvod.nextInt();

        int unit;

        System.out.println("Действие");
        String str = vvod.nextLine();
        str = vvod.nextLine();

        switch (str) {
            case "+":
                unit = num1 + num2;
                System.out.println("Получилось :" + unit);
                break;
            case "-":
                unit = num1 - num2;
                System.out.println("Получилось :" + unit);
                break;
            case "*":
                unit = num1 * num2;
                System.out.println("Получилось :" + unit);
                break;
            case "/":
                if (num2 == 0)
                    System.out.println("На 0 не делят, учи матчасть");
               else {
                    unit = num1 / num2;
                    System.out.println("Получилось :" + unit);
                }
               break;
            default:
                System.out.println("Не верное значение");
        }
    }
}