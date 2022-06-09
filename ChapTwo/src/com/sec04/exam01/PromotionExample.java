package com.sec04.exam01;

/*
작성자 : 최성재
작성일 : 2022.06.09
printf() 메서드 사용 방법
*/
public class PromotionExample {

    public static void main(String[] args) {
        //d : 정수
        //f : 실수
        //s : 문자열
        int value =123;
        System.out.printf("상품의 가격: %d원\n", value);
        System.out.printf("상품의 가격: ||%6d||원\n", value);
        System.out.printf("상품의 가격: ||%-6d||원\n", value);
        System.out.printf("상품의 가격: %06d원\n", value);
        
        double area = 3.14159123456 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이: ||%1.5f||\n", 10, area);
        
        String name = "홍길동";
        String job = "도적";
        System.out.printf("||%06d | %-5s | %10s||\n", 1, name, job);
    }
}
