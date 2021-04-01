package jaemuk.basic.day12;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        // 두수를 입력받아 두 사이의 모든 값의
        // 총합을 구하는 코드를 작성하세요
        // ex) 10, 3 => 3,4,5,6,7,8,9,10 에 대한 총합
        // ex) 3, 10 => 3,4,5,6,7,8,9,10 에 대한 총합

        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요");
        int a = sc.nextInt();

        System.out.println("두번째 숫자를 입력하세요");
        int b = sc.nextInt();

        int sum;
        if (a < b) {
            sum = (a + b) * (b - a + 1) / 2;
        } else if (a > b) {
            sum = (b + a) * (a - b + 1) / 2;
        } else sum = a;

        System.out.println(a + "부터 " + b + "까지의 합은 : " + sum);


    }
}
