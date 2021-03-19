package jaemuk.basic.day04;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		// 구구단 출력하기
		// ex) 7단을 출력하세요 v1
		System.out.println("7 x 1 = 7");
		System.out.println("7 x 2 = 14");
		System.out.println("7 x 3 = 21");
		System.out.println("7 x 4 = 28");
		System.out.println("7 x 5 = 35");
		System.out.println("7 x 6 = 42");
		System.out.println("7 x 7 = 49");
		System.out.println("7 x 8 = 56");
		System.out.println("7 x 9 = 63");
		System.out.println("----- -----"); // 줄바꿈
		
		
		// ex) 7단을 출력하세요 v2 - for
		for(int i = 1; i <= 9; ++i) {
			System.out.println("7 x " + i + " = " + (7 * i));
		}
		
		System.out.println("----- -----"); // 줄바꿈
		
		
		// ex) 7단을 출력하세요 v3 - while, printf
		int i = 1;
		while(i <= 9) {
			System.out.println("7 x " + i + " = " + (7 * i));
			++i;
		}
		
		System.out.println("----- -----"); // 줄바꿈
		
		i = 1;
		String fmt = "7 x %d = %d \n";
		while(i <= 9) {
			System.out.printf(fmt, i, 7 * i);
			++i;
		}
		
		System.out.println("----- -----"); // 줄바꿈
		
		
		// ex) 3단을 출력하세요 v3 - while, printf
		i = 1;
		String fmt2 = "3 x %d = %2d \n";
		while(i <= 9) {
			System.out.printf(fmt2, i, 3 * i);
			++i;
			
		}
		
		System.out.println("----- -----"); // 줄바꿈
		
		
		
		// 구구단 프로그램 v1
		// 사용자로부터 숫자{1 - 9)를 하나 입력받아,
		// 구구단을 출력하는 프로그램 작성
		// Scanner, while, printf
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇단을 출력하시겠습니까?");
		int dan = sc.nextInt();
		
		
		String fmt3 = "%d x %d = %2d \n";
		i = 1;
		while(i <= 9) {
			System.out.printf(fmt3, dan, i, (dan * i));
			++i;
		
		}
		
		
		// 구구단 프로그램 v2
		// 1 - 9 이외에 숫자나 문자를 입력받으면
		// "잘못입력하셨습니다!" 메세지 출력
		
		System.out.println("몇단을 출력하시겠습니까?");
		char dan2 = sc.next().charAt(0);
		// 입력받은 문자열 중 첫번째 글자만 뽑아서
		// char 형 변수에 대입
		
		// 입력받은 문자의 ASCII 코드값이 49~57인지 검사
		String result = (dan2 >= 49 && dan2 <= 57) ? 
				"구구단 출력" : "잘못출력하셨습니다!";
		
		System.out.println(result);
		
		
		
		// 구구단 프로그램 v3
		// 1 - 9 이외에 숫자나 문자를 입력받으면
		// "잘못입력하셨습니다!" 메세지 출력
		
		System.out.println("몇단을 출력하시겠습니까?");
		String dan3 = sc.next();
		
		
		i = 1;
		try {
			while(i <= 9) {
			System.out.printf(fmt, dan3, i, (Integer.parseInt(dan3) * i));
			++i;
			}
		} catch(Exception ex) {
			System.out.println("잘못입력하셨습니다!");
		}
		// 예외처리코드를 이용해서
		// 프로그램 실행중 오류발생시
		// 제어를 catch 코드쪽으로 넘김
		
		
		// ex) 주민번호를 이용해서 성별을 출력하는 코드를 작성하세요
		// 123456-7654321 에서 7이 성별을 나타내는 코드
		// 1 : 1999년 이전 출생 남자
		// 2 : 1999년 이전 출생 여자
		// 3 : 2000년 이후 출생 남자
		// 4 : 2000년 이후 출생 여자
		// charAt 을 이용해서 풀어보세요
		
		System.out.println("주민등록번호를 입력하세요");
		char jumin = sc.next().charAt(7);
		
		String gender = jumin == '1' ? "1999년 이전 출생 남자" :
			jumin == '2' ? "1999년 이전 출생 여자" :
				jumin == '3' ? "2000년 이후 출생 남자" :
					jumin == '4' ? "2000년 이후 출생 여자" : "";
		System.out.println(gender);
		
		
		 
		
	}

}
