package com.sec02.exam01;

/*
작성자 : 최성재
작성일 : 2022.06.08
정수 리터럴
*/
public class IntegerLiteralExample {

    public static void main(String[] args) {
        int var1 = 0b1011; //2진수
        int var2 = 01010; //8진수
        int var3 = 365; //10진수
        int var4 = 0xB3; // 16진수
        
        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
    }
}
