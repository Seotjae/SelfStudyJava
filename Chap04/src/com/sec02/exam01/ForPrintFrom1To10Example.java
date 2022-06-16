package com.sec02.exam01;

/*
작성자 : 최성재
작성일 : 2022.06.16
1부터 10까지 출력
*/
public class ForPrintFrom1To10Example {

    public static void main(String[] args) {
        /*
        for (int i = 0; i <= 10; i++) {
            System.out.println("[i] : " + i);
        }
        
        int j =1;
        for (; j < 10; j++) {
            System.out.println("[j] : " + j);
        }
        */
        for (int i = 0, j = 1; i <= 10 && j <= 10; i++, j++) {
            System.out.println("[i] : " + i + " [j] : " + j);
        }
    }
}
