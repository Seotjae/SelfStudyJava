package com.sec01.exam01;

/*
작성자 : 최성재
작성일 : 2022.06.17
문자열 비교
*/
public class StringEqualsExample {

    public static void main(String[] args) {
        String strVar1 = "신민철";
        String strVar2 = "신민철";
        
        if (strVar1 == strVar2) {
            System.out.println("strVar1과 strVar2 는 참조가 같음");
        }else {
            System.out.println("strVar1과 strVar2 는 참조가 다름");
        }
        
        if (strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2 는 문자열이 같음");
        }
        
        String strVar3 = new String("신민철");
        String strVar4 = new String("신민철");
        
        if (strVar3 == strVar4) {
            System.out.println("strVar3과 strVar4 는 참조가 같음");
        }else {
            System.out.println("strVar3과 strVar4 는 참조가 다름");
        } 
        
        if (strVar3.equals(strVar4)) {
            System.out.println("strVar3과 strVar4 는 문자열이 같음");
        }
    }
}