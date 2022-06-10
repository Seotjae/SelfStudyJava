package com.sec02.exam03;

/*
작성자 : 최성재
작성일 : 2022.06.10
논리 부정 연산자
*/
public class DenyLogicOperatorExample {

    public static void main(String[] args) {
        boolean play = true;
        System.out.println(play);
        
        play = !play;
        System.out.println(play);
        
        play = !play;
        System.out.println(play);
    }
}
