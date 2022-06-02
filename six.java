package com.six;

import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int num = vvod.nextInt();

        if (num == 1) {
            System.out.println("Введите ваш вес");
            String weight = vvod.nextLine();
            weight = vvod.nextLine();

            System.out.println("Ваш вес :" + weight);
        }
        else if (num == 2)
        {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int num1 = vvod.nextInt();

            switch (num1) {
                case 1:
                    System.out.println("Сколько метров перевести?");
                    double metr = vvod.nextDouble();
                    double mil1 = metr * 0.0006;
                    System.out.println("Милей:" + mil1);
                    double yard1 = metr / 1.09;
                    System.out.println("Ярдов:" + yard1);
                    double fut1 = metr / 3.28;
                    System.out.println("Футов" + fut1);
                    break;
                case 2:
                    System.out.println("Сколько миль перевести?");
                    double mil = vvod.nextDouble();
                    System.out.println(mil + "Миль, это: \n" +(mil * 1609.34)+ "Метров \n" +(mil * 1760)+ "Ярдов \n" +(mil * 5280)+"Футов");
                    break;
                case 3:
                    System.out.println("Сколько ярдов перевести?");
                    float yard = vvod.nextFloat();
                    System.out.println(yard + "Ярд, это: \n" +(yard / 0.91)+ "Метров \n" +(yard / 0.0006)+ "Миль \n" +(yard * 3)+"Футов");
                    break;
                case 4:
                    System.out.println("Сколько футов перевести?");
                    double fut = vvod.nextDouble();
                    System.out.println(fut + "Фут, это: \n" +(fut * 0.3)+ "Метров \n" +(fut * 0.0002)+ "Миль \n" +(fut * 0.33)+"Ярдов");
                    break;
                default:
                    System.out.println("Не верное значение");
            }
        }
        else {
            System.out.println("Так нельзя");
        }
    }
}

