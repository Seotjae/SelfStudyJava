package com.sec01.exam04;

/*
작성자 : 최성재
작성일 : 2022.06.07
변수의 사용 범위
*/
public class VariableScopeExample {

    public static void main(String[] args) {
        int v1 = 15;

        if (v1 > 10) {
            int v2;
            v2 = v1 - 10;
        }

        // int v3 = v1 + v2 + 5;
    }
}
