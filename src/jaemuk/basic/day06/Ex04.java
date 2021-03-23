package jaemuk.basic.day06;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        // 생년월일을 통해 나이를 계산
//        int birthday;
//        int year;
//        int currentYear;
//        int currentMonth;
//        int age;
//        int manAge;
//        String fmt = "고객님의 한국 나이는 %d세 이고 \n" +
//                "만 나이는 %d세 입니다";
//        Scanner sc = new Scanner(System.in);
//        System.out.print("태어난 연도는? ");
//        year = sc.nextInt();
//        System.out.print("태어난 월일은? ");
//        birthday = sc.nextInt();
//        System.out.print("현재 연도는? ");
//        currentYear = sc.nextInt();
//        System.out.print("현재 월일은? ");
//        currentMonth = sc.nextInt();
//
//        age = currentYear - year + 1;
//        manAge = currentYear - year;
//        if(birthday > currentMonth) {
//            manAge = manAge - 1;
//        }
//
//        System.out.printf(fmt, age, manAge);

        computeBirth();

        // 잔돈을 화폐단위로 계산








    } // main

    // 생년월일 바탕 나이계산 메서드
    public static void computeBirth() {
        int birthday;
        int year;
        int currentYear;
        int currentMonth;
        int age;
        int manAge;
        String fmt = "고객님의 한국 나이는 %d세 이고 \n" +
                "만 나이는 %d세 입니다";
        Scanner sc = new Scanner(System.in);
        System.out.print("태어난 연도는? ");
        year = sc.nextInt();
        System.out.print("태어난 월일은? ");
        birthday = sc.nextInt();
        System.out.print("현재 연도는? ");
        currentYear = sc.nextInt();
        System.out.print("현재 월일은? ");
        currentMonth = sc.nextInt();

        age = currentYear - year + 1;
        manAge = currentYear - year;
        if(birthday > currentMonth) {
            manAge = manAge - 1;
        }

        System.out.printf(fmt, age, manAge);
    }

} // class
