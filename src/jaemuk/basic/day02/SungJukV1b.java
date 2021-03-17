package jaemuk.basic.day02;

import java.util.Scanner;

/**
 * 
 * @author YJM
 * @category JavaBasic
 * @version 1.1
 * 
 * 자바프로그램 기초 - 성적처리프로그램
 * 이름과 성적데이터를 키보드로 직접입력받아 처리
 * 처리결과 출력시 printf 메서드 사용
 */
public class SungJukV1b {
	public static void main(String[] args) {
		
		//변수선언
		
		String name;
		int kor, eng, mat, tot;
		double avg;
		char grd;
		
		//처리
		
		Scanner sc = new Scanner(System.in);
		//키보드를 이용해서 성적데이터를 입력받기위해
		//Scanner 클래스를 초기화함
		
		System.out.print("이름은?");
		name = sc.next();
		// 키보드로 문자데이터를 입력받아 name 변수에 대입
		System.out.print("국어는?");
		kor = sc.nextInt();
		// 키보드로 숫자데이터를 입력받아 kor 변수에 대입
		System.out.print("영어는?");
		eng = sc.nextInt();
		System.out.print("수학은?");
		mat = sc.nextInt();
		
		// 총점, 평균 처리
		
		tot = kor + eng + mat;
		avg = tot / 3;
		grd = '가';
	
		// 출력
		// 이름 : ??, 국어 : ??, 영어 : ??, 수학 : ??
		// 총점 : ??, 평균 : ??, 학점 : ??
		System.out.printf(
				"이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d\n총점 : %d, 평균 : %f, 학점 : %s", name, kor, eng, mat, tot, avg, grd);
		
		//또 다른 방법
		String fmt = "이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d\n";
		System.out.printf(fmt, name, kor, eng, mat);
		
		fmt = "총점 : %d, 평균 : %.1f, 학점 : %s"; // %f 뒤에 .1을 붙이면 소수점 자리수 지정
		System.out.printf(fmt, tot, avg, grd);
		
		
		
	}

}
