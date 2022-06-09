package com.sec04.exam03;

import java.io.IOException;

/*
작성자 : 최성재
작성일 : 2022.06.09
입력된 키의 개수와 상관없이 키코드 읽기
*/
public class ContinueKeyCodeReadExample {

    public static void main(String[] args) throws IOException {
        int keyCode;
        
        while (true) {
            keyCode = System.in.read();
            System.out.println("keyCode: " + keyCode);
        }
    }
}
