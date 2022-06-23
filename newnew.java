package com.ewnewnew;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class newnew {
    public static void main(String[] args) {
        int count;
        int tepmCount  = 0;
        String answer = "" ;


        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int quanLines = scan.nextInt();
        String[] arrLines = new String[quanLines];
        scan.nextLine();
        for (int i = 0; i < arrLines.length; i++) {
            System.out.printf("Твоя %d строка: ", (i + 1));
            arrLines[i] = scan.nextLine();
        }
        for (String arrLine : arrLines) {
            char[] arr = arrLine.toCharArray();
            Set<Character> mySet = new HashSet<>();
            for (char c : arr) {
                mySet.add(c);
                count = mySet.size();
                if (count > tepmCount) {
                    tepmCount++;
                    answer = arrLine;
                }
            }
        }
        System.out.println(answer);
    }
}
