package com.sec01.exam03;

/*
작성자 : 최성재
작성일 : 2022.06.14
if-else if-else문
*/
public class IfElseIfElseExample {

    public static void main(String[] args) {
         int score = 75;
         
         while (true) {
             if (score >= 90) {
                 System.out.println("점수가 " + score + "입니다.");
                 System.out.println("등급은 A입니다.");
                 break;
             }else if(score >= 80) {
                 System.out.println("점수가 " + score + "입니다.");
                 System.out.println("등급은 B입니다.");
             }else if (score >= 70) {
                 System.out.println("점수가 " + score + "입니다.");
                 System.out.println("등급은 C입니다.");
             }else {
                 System.out.println("점수가 " + score + "입니다.");
                 System.out.println("등급은 D입니다.");           
             }
             score++;
        }
    }
}
