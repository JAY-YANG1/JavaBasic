package jaemuk.basic.day12;

import java.util.Random;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        // 하루는 86400초이다.
        // 입력값이 1234567890일 경우 며칠인지 계산하여라
        // 한 시간은 3600초이다.
        // 입력값이 98765일 경우 몇 시간인지 계산하여라
        // 일 분은 60초이다.
        // 입력값이 12345일 경우 몇 분인지 계산하여라
        int data1 = 1234567890;
        System.out.println(data1 / 86400);
        System.out.println(
                Math.round((double)data1 / 86400));

        int data2 = 98765;
        System.out.println(data2 / 3600);
        System.out.println(
                Math.round((double)data2 / 3600 ));

        int data3 = 12345;
        System.out.println(data3 / 60);
        System.out.println(
                Math.round((double)data3 / 60));


        // 복권 발행 프로그램을 작성하세요
        // 복권 3자리 숫자를 입력받음
        // 임의의 복권 3자리 숫자 생성
        // 모두 일치 - 상금 1백만원
        // 불일치 - 다음 기회를!
        // 위치에 상관없이 숫자만 일치하면 됨!
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int match = 0;

        System.out.println("복권 3자리 숫자를 입력하세요");
        int yourKey = sc.nextInt();

        int lottoKey = rnd.nextInt(1000);

        // 입력값과 난수 비교
//        char lkey1 = String.valueOf(lottoKey).charAt(0);
//        char lkey2 = String.valueOf(lottoKey).charAt(1);
//        char lkey3 = String.valueOf(lottoKey).charAt(2);
//
//        char ykey1 = String.valueOf(yourKey).charAt(0);
//        char ykey2 = String.valueOf(yourKey).charAt(1);
//        char ykey3 = String.valueOf(yourKey).charAt(2);

//        if (lkey1 == ykey1 || lkey1 == ykey2 || lkey1 == ykey3) {
//            ++match;}
//        if (lkey2 == ykey1 || lkey2 == ykey2 || lkey2 == ykey3) {
//            ++match;}
//        if (lkey3 == ykey1 || lkey3 == ykey2 || lkey3 == ykey3) {
//            ++match;}

        for(int i = 0; i < 3; ++i) {
            char lkey = String.valueOf(lottoKey).charAt(i);
            for(int j = 0; j < 3; ++j) {
                char ykey = String.valueOf(yourKey).charAt(j);
                if (lkey == ykey) {
                    ++match;
                }
            }
        }



        System.out.println(yourKey + "/" + lottoKey);

        System.out.println("일치갯수 : " + match);



    } // main
} // class
