package jaemuk.basic.day03;

public class Ex09 {
	public static void main(String[] args) {
		//가
		System.out.println(true && false && true || true);
		
		//나
		System.out.println(true || true && true && false);
		
		//다
		System.out.println((true && false) || (true && ! false) || (false && !false));
		
		//라
		System.out.println((2 < 3) || (5 > 2) && !(4 == 4) || 9 != 4 );
		
		//마
		System.out.println(6 == 9 || 5 < 6 && 8 < 4 || 4 > 3);
	}

}
