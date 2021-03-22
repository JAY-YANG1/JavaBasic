package jaemuk.basic.day05;

import java.util.Scanner;

/**
 * 
 * @author YJM
 * @category JavaBasic
 * @version 2
 * 
 * 
 *          자바프로그램 기초 - 성적처리프로그램V2b
 * 
 *          성적 처리시 학점 계산을 switch 문으로 작성
 * 
 * 
 */

public class SungJukV2b {

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
			grd = '가';
			//if (avg >= 90) {
			//	grd = '수';
			//} else if (avg >= 80) {
			//	grd = '우';
			//} else if (avg >= 70) {
			//	grd = '미';
			//} else if (avg >= 60) {
			//	grd = '양';
			//} else {
			//	grd = '가';
			//}
			
			// 학점계산을 swich 문으로 작성한다면?
			// avg : 99.9 => int(avg) : 99
			switch ((int)avg / 10) {
			case 10:
			case 9:
				grd = '수'; break;
			case 8: 
				grd = '우'; break;
			case 7: 
				grd = '미'; break;
			case 6: 
				grd = '양'; break;
			default
			: grd = '가';
			}

			// 결과출력

			System.out.printf(fmt, name, kor, eng, mat, tot, avg, grd);

			// 반복증감식
			++i;

		} // while

	} // main

} // class
