package YJM.Basic.day01;

/**
 * 
 * @author YJM
 * @category JavaBasic
 * @version 1.0
 * 자바프로그램 기초 - 성적처리프로그램 클래스
 * 입력 : 이름, 국어, 영어, 수학
 * 처리 : 총점, 평균, 학점
 * 출력 : 이름, 국어, 영어, 수학, 총점, 평균, 학점
 */

public class SungjukV1 {
	//변수선언
	public static void main(String[] args) {
		String name;
		int kor;
		int eng;
		int mat;
		int tot;
		double avg;
		char grd;
		
	//처리
		name = "홍길동";
		kor = 95;
		eng = 78;
		mat = 84;
		tot = kor + eng + mat;
		avg = tot / 3;
		grd = '가';
		
	//결과 출력
		System.out.print("이름 : ");
		System.out.println(name);
		System.out.print("국어 : ");
		System.out.println(kor);
		System.out.print("영어 : ");
		System.out.println(eng);
		System.out.print("수학 : ");
		System.out.println(mat);
		System.out.print("총점 : ");
		System.out.println(tot);
		System.out.print("평균 : ");
		System.out.println(avg);
		System.out.print("학점 : ");
		System.out.println(grd);
		
		
	}

}
