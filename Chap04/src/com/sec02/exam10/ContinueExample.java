package com.sec02.exam10;

/*
작성자 : 최성재
작성일 : 2022.06.16
continue를 사용한 for문
*/
public class ContinueExample {

    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i % 2 != 0) {
                continue;
            }
            
            System.out.println(i);
        }
    }
}
