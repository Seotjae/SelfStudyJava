package com.sec03.exam02;

/*
작성자 : 최성재
작성일 : 2022.06.08
강제 타입 변환
*/
public class CastingExample {

    public static void main(String[] args) {
        //Casting
        int intValue = 44032;
        char charValue = (char) intValue;
        System.out.println("intValue => charValue : " + intValue + " => " + charValue);
        
        long longValue = 500000000000L;
        intValue = (int) longValue;
        System.out.println("longValue => intValue : " + longValue + " => " + intValue);
        
        double doubleValue = 125.1234567890123456789;
        intValue = (int) doubleValue;
        System.out.println("longValue => intValue : " + longValue + " => " + intValue);        
    }
}
