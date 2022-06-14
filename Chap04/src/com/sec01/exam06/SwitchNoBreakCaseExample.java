package com.sec01.exam06;

/*
작성자 : 최성재
작성일 : 2022.06.14
char 타입의 switch문
*/
public class SwitchNoBreakCaseExample {

    public static void main(String[] args) {
        char grade = 'A';
        
        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("우수 회원입니다.");
                break;
            case 'B':
            case 'b':
                System.out.println("일반 회원입니다.");
                break;
            default:
                System.out.println("손님입니다.");
                break;
        }
    }
}
