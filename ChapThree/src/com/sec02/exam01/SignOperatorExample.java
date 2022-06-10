package com.sec02.exam01;

/*
작성자 : 최성재
작성일 : 2022.06.10
부호 연산자
*/
public class SignOperatorExample {

    public static void main(String[] args) {
        int x = -100;
        int result1 = +x;
        int result2 = -x;
        
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        
        byte b = 100;
        byte result3 = (byte) -b;
        int result4 = -b;
        
        System.out.println("result3: " + result3);
        System.out.println("result4: " + result4);
    }
}
