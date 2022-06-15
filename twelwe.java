package com.eleven;

import java.util.Locale;

public class twelwe {
    public static void main(String[] args){
        String line = "I like Java!!!";
        if(line.contains("Java") && line.startsWith("I like") && line.endsWith("!!!") ){
            System.out.println(line.toUpperCase(Locale.ROOT));
        }
        char[] charLine = line.toCharArray();
        for (int i = 0; i <charLine.length; i++) {
            if(charLine[i] == 'a'){
                charLine[i] ='о';
            }
        }
        String stringLine = new String(charLine);
        System.out.println(stringLine.substring(7,11));
    }
}

