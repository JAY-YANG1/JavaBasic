package jaemuk.basic.day06;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // 간단한 계산 프로그램 작성
        // ex) 두 수를 입력받아 더하기를 수행하는 프로그램 작성

//        int a, b;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("두 수를 입력받습니다");
//        System.out.print("첫번째 숫자는? ");
//        a = sc.nextInt();
//        System.out.print("두번째 숫자는? ");
//        b = sc.nextInt();
//
//        int sum = a + b;
//
//        String fmt = "입력받은 수는 각각 %d, %d 이고요 \n" +
//                     "두 수의 총합은 %d 입니다";
//        System.out.printf(fmt, a, b, sum);


        // ex) 두 수를 입력받아 더하기를 수행하는 프로그램 작성 v2
        plusTwo();



    } // main

    // 두 수를 입력받아 더하기를 수행하는 메서드
    public static void plusTwo() {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("두 수를 입력받습니다");
        System.out.print("첫번째 숫자는? ");
        a = sc.nextInt();
        System.out.print("두번째 숫자는? ");
        b = sc.nextInt();

        int sum = a + b;

        String fmt = "입력받은 수는 각각 %d, %d 이고요 \n" +
                "두 수의 총합은 %d 입니다";
        System.out.printf(fmt, a, b, sum);
    }



} // class
