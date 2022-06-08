package com.sec03.exam04;

/*
작성자 : 최성재
작성일 : 2022.06.08
정수 타입의 연산
*/
public class LongOperationExample {

    public static void main(String[] args) {
        byte value1 = 10;
        int value2 = 100;
        long value3 = 1000L;
        
        int result1 = (int) (value1 + value2 + value3);
        System.out.println(result1);
        
        long result2 = value1 + value2 + value3;
        System.out.println(result2);
    }
}
