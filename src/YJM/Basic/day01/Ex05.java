package YJM.Basic.day01;

public class Ex05 {

	public static void main(String[] args) {
		
		double number = (1 / 3) * 3; 
		System.out.println("(1 / 3) * 3 = " + number);
		/**
		 *  예상값 : 1, 실제값 : 0.0
		 *  0이 나오는 이유
		 *  형변환(자바에서 정수와 정수를 연산하면 정수)
		 */
		
		int quotient = 7 / 3;
		System.out.println("7 / 3 = " + quotient);
		// 예상값 : 2.333333, 실제값 : 2
		
		int remainder = 7 % 3;
		System.out.println("7 % 3 = " + remainder);
		
		int result = 11; result /= 2;
		System.out.println("result /= 2 = " + result);
		/**
		 *  복합대입연산자
		 *  산술연산자 + 대입연산자
		 *  ex) a = a + 1 => a += 1
		 */

	}

}
