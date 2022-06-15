package com.eleven;

import java.util.Arrays;

public class slojna {
    public static void main(String[] args){
        double[] arr =new double[15];
        for (int i = 0; i <arr.length; i++) {
            double a = (Math.random()*(40+1)) - 20;
            arr[i]=a;
        }
        Arrays.sort(arr);
        System.out.println("Минимальный элемент : "+arr[0] + "\nМаксимальный элемент : "+ arr[arr.length-1]);
        if(Math.abs(arr[0])>Math.abs(arr[arr.length-1])){
            System.out.println("Большее по модулю "+ arr[0]);
        }else if (Math.abs(arr[0])<Math.abs(arr[arr.length-1])){
            System.out.println("Большее по модулю "+ arr[arr.length-1]);
        }else{
            System.out.println("равны");
        }
    }
}

