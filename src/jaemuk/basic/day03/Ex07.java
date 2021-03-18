package jaemuk.basic.day03;

public class Ex07 {
	public static void main(String[] args) {
		//가
		System.out.println(3 + 4.5 * 2 + 27 / 8);
		
		//나
		//System.out.println(true || false && 3 < 4 || !(5 == 7));
		System.out.println(true);
		
		//다
		//System.out.println(true || (3 < 5 && 6 >= 2));
		System.out.println(true);
		
		//라
		//System.out.println(!true > 'A');
		//잘못된 비교대상으로 오류
		
		//마
		System.out.println(7 % 4 + 3 - 2 / 6 * 'Z');
		//단일문자를 수식에 사용하면 자동으로 숫자형으로 바뀜
		//숫자형으로 변환시 ASCII코드값을 참조함
		//0 : 48, A : 65, a :97
		// => Z : 90, D :68, M : 77
		
		//바
		System.out.println('D' + 1 + 'M' % 2 / 3);
		
		//사
		System.out.println(5.0 / 3 + 3 / 3);
		
		//아
		System.out.println(53 % 21 < 45 / 18);
		
		//자
		//System.out.println((4 < 6) || true && false || false && (2 > 3));
		System.out.println(4 < 6);
		
		//차
		System.out.println(7 - (3 + 8 * 6 + 3) - (2 + 5 * 2));
		
		
	}

}
