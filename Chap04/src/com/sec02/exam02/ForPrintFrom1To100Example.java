package com.sec02.exam02;

/*
작성자 : 최성재
작성일 : 2022.06.16
1부터 100까지 출력
*/
public class ForPrintFrom1To100Example {

    public static void main(String[] args) {
        int sum = 0;
        
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        
        System.out.println("1~100 합 : " + sum);
    }
}
