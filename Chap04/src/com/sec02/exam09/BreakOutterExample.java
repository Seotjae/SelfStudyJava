package com.sec02.exam09;

/*
작성자 : 최성재
작성일 : 2022.06.16
바깥쪽 반복문 종료
*/
public class BreakOutterExample {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Outter : for (char upper = 'A'; upper <= 'Z'; upper++) {
            System.out.println("[[[바깥]]] : " + upper);
            
            for (char lower = 'a'; lower <= 'z'; lower++) {
                System.out.println("[안쪽] : " + lower);
                
                if (lower == 'g') {
                    break Outter;                    
                }
            }
        }
        System.out.println("시스템 종료");
    }
}
