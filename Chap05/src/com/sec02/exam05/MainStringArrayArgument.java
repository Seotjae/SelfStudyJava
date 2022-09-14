package com.sec02.exam05;

/*
작성자 : 최성재
작성일 : 2022.09.14
배열의 length 필드
*/
public class MainStringArrayArgument {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("값의 수가 부족합니다.");
            System.exit(0);
        }
        
        String strNum1 = args[0];
        String strNum2 = args[1];
        
        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}
