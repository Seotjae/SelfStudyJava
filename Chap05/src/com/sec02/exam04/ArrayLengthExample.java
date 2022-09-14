package com.sec02.exam04;

/*
작성자 : 최성재
작성일 : 2022.09.14
배열의 length 필드
*/
public class ArrayLengthExample {
    public static void main(String[] args) {
        int[] scores = {60, 80, 110};
        int sum = 0;
        
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        
        System.out.println(sum);
        
        System.out.println((double)sum / scores.length);
    }
}
