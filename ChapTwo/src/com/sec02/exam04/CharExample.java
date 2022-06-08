package com.sec02.exam04;

/*
작성자 : 최성재
작성일 : 2022.06.08
char 타입 변수
*/
public class CharExample {

    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';
        
        char c4 = '가';
        char c5 = 44032;
        char c6 = '\uac00';
        
        int iC1 = 'A';
        int iC2 = 65;
        int iC3 = '\u0041';
        
        int iC4 = '가';
        int iC5 = 44032;
        int iC6 = '\uac00';
        
        System.out.println(c1 + " : " + iC1);
        System.out.println(c2 + " : " + iC2);
        System.out.println(c3 + " : " + iC3);
        System.out.println(c4 + " : " + iC4);
        System.out.println(c5 + " : " + iC5);
        System.out.println(c6 + " : " + iC6);
    }
}
