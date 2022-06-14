package com.sec01.exam01;

/*
작성자 : 최성재
작성일 : 2022.06.14
if문
*/
public class IfExample {

    public static void main(String[] args) {
         int score = 95;
         
         if (score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }
         
        if (score < 90) {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
        }
    }
}
