package com.sec02.exam08;

/*
작성자 : 최성재
작성일 : 2022.06.16
break로 while문 종료
*/
public class BreakExample {

    public static void main(String[] args) {
        int num;
        
        while (true) {
            num = (int) (Math.random() * 6) + 1;
            System.out.println(num);
            
            if (num == 6) {
                System.out.println("주사위 6");
                break;
            }
        }
        
        System.out.println("프로그램 종료");
    }
}
