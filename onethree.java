package com.onethree;

import java.util.Scanner;

public class onethree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Конвентер валют.\nВведите нынешний курс доллара: ");
        double dol = scan.nextDouble();
        System.out.println("Введите количество рублей для конвертации: ");
        double rub = scan.nextDouble();
        double result = rub / dol;
        String value = String.format("%.2f", result);
        System.out.println("Итого : " + value);
    }
}