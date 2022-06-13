package com.sec02.exam09;

/*
작성자 : 최성재
작성일 : 2022.06.13
논리연산자
*/
public class LogicalOperatorExample {

    public static void main(String[] args) {
        //&& 와 & (|| 와 |)
        //&& 는 앞의 조건이 false 이면 뒤의 조건을 평가하지 않음
        //|| 도 마찬가지 앞의 조건이 true 이면 뒤의 조건을 평가하지 않음
    
        int charCode = '0';
        
        if ((charCode >= 65) & (charCode <= 90)) {
            System.out.println("대문자군요.");
        }
        
        if ((charCode >= 97) && (charCode <= 122)) {
            System.out.println("소문자군요.");
        }
        
        if (!(charCode < 48) && !(charCode > 57)) {
            System.out.println("0 ~ 9 숫자군요.");
        }
        
        int value = 7;
        
        if ((value % 2 == 0) | (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수군요.");
        }
        
        if ((value % 2 == 0) || (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수군요.");
        }
    }
}
