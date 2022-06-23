package com.next;

import java.util.Scanner;

public class javic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите уравнение, которое хотите посчитать,где английское x - число,которое требуется вычислить.\nДоступны числа: 0-9\nДоступны виды операций + и -\n");
        String inputLineEquation = scan.nextLine();
        char[] charInputLineEquation = inputLineEquation.toCharArray();
        String one = Character.toString(charInputLineEquation[0]);
        String two = Character.toString(charInputLineEquation[1]);
        String three = Character.toString(charInputLineEquation[2]);
        String five = Character.toString(charInputLineEquation[4]);


        int result;
        if (one.equals("x")) {
            int fiveInt = Integer.parseInt(five);
            int threeInt = Integer.parseInt(three);
            if (two.equals("+")) {
                result = fiveInt - threeInt;
            } else {
                result = fiveInt + threeInt;
            }
            System.out.println("Х = " + result);
        }
        if (three.equals("x")) {
            int fiveInt = Integer.parseInt(five);
            int oneInt = Integer.parseInt(one);
            if (two.equals("+")) {
                result = fiveInt - oneInt;
            } else {
                result = oneInt - fiveInt;
            }
            System.out.println("Х = " + result);

        }
        if (five.equals("x")) {
            int oneInt = Integer.parseInt(one);
            int threeInt = Integer.parseInt(three);
            if (two.equals("+")) {
                result = oneInt + threeInt;
            } else {
                result = oneInt - threeInt;
            }
            System.out.println("Х = " + result);
        }
    }
}
