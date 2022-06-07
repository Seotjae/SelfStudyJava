package com.sec01.exam01;

/*
작성자 : 최성재
작성일 : 2022.06.07
ChapTwo 도입부 : 변수 선언, 값 저장
*/
public class ChapTwoIntro {

    public static void main(String[] args) {
        // 변수 선언, 같은 타입 변수는 , 를 이용해서 한꺼번에 선언 가능
        int x, y, z; // int x; int y;

        // 값 저장시 = 대입 연산자 사용
        int score;
        // System.out.println(score);
        score = 90;
        System.out.println(score);

        // 변수 초기화 : 최초로 값이 저장될 때 변수 생성
        int scoreTwo = 90; // 초기값

        // 초기화되면 메모리 번지 정보를 갖고 값 저장
        /*
         * 잘못된 예 int value; int result = value + 10;
         */
        int value = 30;
        int result = value + 10;
        System.out.println(result);
    }
}
