package com.sec02.exam02;

/*
작성자 : 최성재
작성일 : 2022.09.14
값 목록으로 배열 생성
*/
public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[] {83, 90, 87};
        
        int sum1 = 0;
        for (int i = 0; i < scores.length; i++) {
            sum1 += scores[i];
            
            System.out.println("sum1 : " + sum1);
        }
        
        int sum2 = add(new int[] {83, 90, 87});
        
        System.out.println("sum2 : " + sum2);
        System.out.println();
    }
    
    public static int add(int[] scores) {
        int sum = 0;
        
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        
        return sum; 
    }
}
