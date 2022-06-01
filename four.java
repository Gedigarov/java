package four;

import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите число X");
        int num1 = vvod.nextInt();

        System.out.println("Введите число Y");
        int num2 = vvod.nextInt();

        System.out.println("Введите число Z");
        int num3 = vvod.nextInt();

       int sr = (num1 + num2 + num3) / 3;
        int sr1 = sr / 2;
        if (sr1 > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
    }