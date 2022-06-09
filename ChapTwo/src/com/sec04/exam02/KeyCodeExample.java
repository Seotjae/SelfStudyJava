package com.sec04.exam02;

import java.io.IOException;

/*
작성자 : 최성재
작성일 : 2022.06.09
입력된 키코드를 변수에 저장
*/
public class KeyCodeExample {

    public static void main(String[] args) throws IOException {
        int keyCode;
        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);
        
        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);
        
        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);
    }
}
