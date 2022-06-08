package com.sec03.exam07;

/*
작성자 : 최성재
작성일 : 2022.06.08
기본 타입과 문자열 간의 변환
*/
public class PrimitiveAndStringConversionExample {

    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");
        System.out.println("value1: " + value1);
        
        double value2 = Double.parseDouble("3.14");
        System.out.println("value2: " + value2);
        
        boolean value3 = Boolean.parseBoolean("true");
        System.out.println("value3: " + value3);
        
        String str1 = String.valueOf(10);
        System.out.println("str1: " + str1);
        
        String str2 = String.valueOf(3.14);
        System.out.println("str1: " + str2);

        String str3 = String.valueOf(true);
        System.out.println("str1: " + str3);
    }
}
