package com.sec02.exam07;

/*
작성자 : 최성재
작성일 : 2022.06.16
1부터 100까지 합
*/
public class WhilePrintFrom1To100Example {

    public static void main(String[] args) {
        int sum = 0;
        int i =0;
        
        while (i <= 100) {
            System.out.println("더하는 [i] : " + i);
            sum += i;
            i++;
            System.out.println("현재 합 : " + sum);
        }
    }
}
