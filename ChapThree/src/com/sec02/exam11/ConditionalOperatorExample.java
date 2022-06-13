package com.sec02.exam11;

/*
작성자 : 최성재
작성일 : 2022.06.13
삼항 연산자
*/
public class ConditionalOperatorExample {

    public static void main(String[] args) {
        int score = 85;
    
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println(score + "점은 " + grade + "등급입니다.");
    }
}
