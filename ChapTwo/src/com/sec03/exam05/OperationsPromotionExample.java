package com.sec03.exam05;

/*
작성자 : 최성재
작성일 : 2022.06.08
연산식에서 자동타입 변환
*/
public class OperationsPromotionExample {

    public static void main(String[] args) {
        byte byteValue1 = 10;
        byte byteValue2 = 20;
        
        byte byteValue3 = (byte) (byteValue1+ byteValue2);
        System.out.println(byteValue3);
        
        int intValue = byteValue1+ byteValue2;
        System.out.println(intValue);
        
        char charValue1 = 'A';
        char charValue2 = 1;
        
        char charValue = (char) (charValue1 + charValue2);
        System.out.println(charValue);
        
        int intValue2 = charValue1 + charValue2;
        System.out.println("유니코드: " + intValue2);
        System.out.println("문자: " + (char)intValue2);
        
        int intValue3 = 10;
        int intValue4 = intValue3/4;
        System.out.println(intValue4);
        System.out.println((float)intValue4);
        
        int intValue5 = 10;
        //int intValue6 = 10 / 4.0;
        double doubleValue = intValue5 / 4.0;
        System.out.println(doubleValue);
        
        double intValue5V2 = 10.0;
        //int intValue6 = 10 / 4.0;
        double doubleValueV2 = intValue5V2 / 4;
        System.out.println(doubleValueV2);
        
        int x =1;
        int y =2;
        double result = x/y;
        System.out.println(result);
        result = (double)x/y;
        System.out.println(result);
    }
}
