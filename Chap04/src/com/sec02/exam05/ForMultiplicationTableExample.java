package com.sec02.exam05;

/*
작성자 : 최성재
작성일 : 2022.06.16
구구단 출력하기
*/
public class ForMultiplicationTableExample {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.println("==========구구단 " + i + "단============");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i +" X " + j +" : "+ (i * j));
            }
        }
    }
}
