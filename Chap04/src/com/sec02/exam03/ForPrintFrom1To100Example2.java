package com.sec02.exam03;

/*
작성자 : 최성재
작성일 : 2022.06.16
1부터 100까지 출력
*/
public class ForPrintFrom1To100Example2 {

    public static void main(String[] args) {
        int sum = 0;
        
        int i = 0;
        for (i = 0; i <= 150; i++) {
            sum += i;
        }
        
        System.out.println("1~" + (i - 1) + " 합 : " + sum);
    }
}
