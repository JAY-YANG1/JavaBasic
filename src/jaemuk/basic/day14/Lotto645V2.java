package jaemuk.basic.day14;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Lotto645V2 {
    public static void main(String[] args) {
        // 로또 645 프로그램 만들기
        // Set 를 이용해서 1 ~ 45 사이 임의의 6개 숫자 생성
        // 중복은 허용하지 않음
        // Random - nextInt, while

//        Random rnd = new Random();
//        for(int i = 1; i <= 6; ++i) {
//            int key = rnd.nextInt(45) + 1;
//            System.out.print(key + " ");
//        }
        // 번호 중복 발생


//        Set<Integer> lottos = new HashSet<>();
//
//        int key = rnd.nextInt(45) + 1;
//
//        int i = 0;
//        while(i < 6) {
//            lottos.add(key);
//            ++i;
//        }
//
//        for(Integer lotto : lottos) {
//            System.out.print(lotto + " ");
//        }
        // 중복이 한번 발생할때마다 lotto 변수의 갯수가 하나씩 줄어듬

        Set<Integer> lottos = new HashSet<>();
        while(lottos.size() < 6) {
            Random rnd = new Random();
            int key = rnd.nextInt(45) + 1;
            lottos.add(key);
        } // 중복값이 나오지 않을 때까지 뽑기를 계속 무한 반복
        // 복원추출 - 한번 뽑은 것을 다시 뽑을 수 있음

        for(Integer lotto : lottos) {
            System.out.print(lotto + " ");
        }


    }
}
