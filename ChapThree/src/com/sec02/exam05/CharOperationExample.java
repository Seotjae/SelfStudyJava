package com.sec02.exam05;

/*
작성자 : 최성재
작성일 : 2022.06.10
char 타입의 산술 연산
*/
public class CharOperationExample {

    public static void main(String[] args) {
        char c1 = 'A' + 1;
        char c2 = 'A';
        char c3 = (char) (c2 + 1);
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);
    }
}
