package com.sec01.exam03;

/*
작성자 : 최성재
작성일 : 2022.06.07
변수값 교환
*/
public class VariableExchangeExample {

    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x:" + x + ", y:" + y);

        // x = y;
        // y = x;
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x:" + x + ", y:" + y);
    }
}
