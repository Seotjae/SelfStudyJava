package com.sec02.exam02;

/*
작성자 : 최성재
작성일 : 2022.06.10
증감연산자
*/
public class IncreaseDecreaseOperatorExample {

    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;
        
        System.out.println("===========================");
        
        x++;
        ++x;
        System.out.println("x = " + x);
        
        System.out.println("===========================");
        
        y--;
        --y;
        System.out.println("y = " + y);
        
        System.out.println("===========================");
        
        z = x++;
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        
        System.out.println("===========================");
        
        z = ++x;
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        
        System.out.println("===========================");
        
        z = ++x + y++;
        System.out.println("z = " + z); //23
        System.out.println("x = " + x); //15
        System.out.println("y = " + y); //9
    }
}
