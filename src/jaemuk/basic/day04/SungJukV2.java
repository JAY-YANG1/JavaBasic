package jaemuk.basic.day04;

import java.util.Scanner;

/**
 * 
 * @author YJM
 * @category JavaBasic
 * @version 2
 * 
 * 
 *          자바프로그램 기초 - 성적처리프로그램V2
 * 
 *          이름과 성적데이터를 키보드로 직접입력받아 총점, 평균, 학점 처리하고 결과출력
 * 
 *          반복문을 이용해서 성적데이터입력을 계속 수행함
 * 
 * 
 */

public class SungJukV2 {

	public static void main(String[] args) {
		// 변수선언
		String name;
		int kor;
		int eng;
		int mat;
		int tot;
		double avg;
		char grd;
		String fmt = "%s, %d, %d, %d \n" + "%d, %.1f %c \n";

		Scanner sc = new Scanner(System.in);

		// 성적처리
		int i = 1;
		while (i <= 3) { // 변수 없이 while 문의 조건식을 true로 설정하면
						 // 끝 없이 계속 코드를 실행
			System.out.println("이름은?");
			name = sc.next();
			System.out.println("국어는?");
			kor = sc.nextInt();
			System.out.println("영어는?");
			eng = sc.nextInt();
			System.out.println("수학은?");
			mat = sc.nextInt();

			tot = kor + eng + mat;
			avg = (double) tot / 3;
			grd = (avg >= 90) ? '수' : 
				  (avg >= 80) ? '우' : 
				  (avg >= 70) ? '미' : 
				  (avg >= 60) ? '양' : '가';

			// 결과출력

			System.out.printf(fmt, name, kor, eng, mat, tot, avg, grd);

			// 반복증감식
			++i;

		} // while

	} // main

} // class
