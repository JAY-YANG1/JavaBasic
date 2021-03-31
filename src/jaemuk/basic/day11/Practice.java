package jaemuk.basic.day11;

import java.util.Scanner;

public class Practice {
    //Q14 Q25
    public static void main(String[] args) {
        int a = 1234567890;
        int b = 98765;
        int c = 12345;
        int day = 86400;
        int hour = 3600;
        int minute = 60;

        System.out.println(a / day);
        System.out.println(b / hour);
        System.out.println(c / minute);

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 숫자를 입력하세요 : ");
        int num2 = sc.nextInt();
        System.out.print("세번째 숫자를 입력하세요 : ");
        int num3 = sc.nextInt();

        int num11 = (int)(Math.random() * 45) + 1;
        int num22 = (int)(Math.random() * 45) + 1;
        int num33 = (int)(Math.random() * 45) + 1;

        if(num1 == num11 || num1 == num22 || num1 == num33) {
            if(num2 == num11 || num2 == num22 || num2 == num33) {
                if(num3 == num11 || num3 == num22 || num3 == num33) {
                    System.out.println("상금 1백만 지급");
                }
            }
        } else {
            System.out.println("아쉽지만, 다음 기회를!");
        }



    }



}
