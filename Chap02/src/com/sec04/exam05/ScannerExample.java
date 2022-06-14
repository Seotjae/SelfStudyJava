package com.sec04.exam05;

import java.io.IOException;
import java.util.Scanner;

/*
작성자 : 최성재
작성일 : 2022.06.09
키보드에서 입력된 내용을 문자열로 얻기
*/
public class ScannerExample {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String inputData;
        
        //inputData = scan.next(); //공백에서 종료
        //System.out.println("입력된 문자열: \"" + inputData + "\"");
        
        while (true) {
            inputData = scan.nextLine(); //공백도 입력받음
            System.out.println("입력된 문자열: \"" + inputData + "\"");
            if (inputData.equals("q")) {
                break;
            }
        }
        
        scan.close();
    }
}
