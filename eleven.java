package com.eleven;

import java.util.Scanner;

public class eleven {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        String num1 = scan.nextLine();
        System.out.println("Введите второе число");
        int num2 = scan.nextInt();
        int num = Integer.parseInt(num1);
        if(num>num2){
            System.out.println("Число "+ num+" большее."+ "\nЧисло "+(double)num2+" меньшее.");
        }else if(num<num2){
            System.out.println("Число "+ num2+" большее."+ "\nЧисло "+(double)num+" меньшее.");
        }else {
            System.out.println("Числа равны");
        }
    }
}
