package com.sec03.exam03;

/*
작성자 : 최성재
작성일 : 2022.06.08
정수 타입의 연산
*/
public class ByteOperationExample {

    public static void main(String[] args) {
        byte result1 = 10 + 20;
        System.out.println(result1);
        
        byte x = 10;
        byte y = 20;
        
        byte result2 = (byte) (x + y);
        System.out.println(result2);
        
        int result3 = x + y;
        System.out.println(result3);
    }
}
