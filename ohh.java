package com.ohh;

import java.util.Scanner;

public class ohh {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final String answer = "Заархивированный вирус";
        final String prompt = "поменяй первые буквы....Каархивированный пирус";
        boolean f = true;
        boolean usePrompt = true;
        int counter = 0;


        System.out.println("Привет! Твоя задача отгадать загадку с 3-х попыток.\nПри первой попытке у тебя есть 1 подсказка, для этого введи \"подсказка\".\nА вот и загадка: \nСидит дед, во сто шуб одет,кто его раздевает, тот слезы проливает");
        while (counter < 3) {
            String var = scan.nextLine();
            if (!var.equals(answer)&& !usePrompt&&!var.equals("подсказка")){
                System.out.println("Програл(\nОбидно, приходи в другой раз!)");
                break;
            }
            if (var.equals("подсказка")) {
                if (counter == 0) {
                    System.out.println(prompt);
                    usePrompt = false;
                } else {
                    System.out.println("Нельзя использовать подсказку");
                }
            }
            if (var.equals(answer)) {
                System.out.println("Правильно, ура!)\nТы победил с попытки номер " + (counter + 1));
                counter = 3;
                f = false;
            } else {
                System.out.println("Подумай еще.\nОсталось " + (2 - counter) + " попытки(попытка)");
            }
            counter++;
        }
        if(counter==3 && f){
            System.out.println("Обидно, приходи в другой раз!");
        }
    }
}
