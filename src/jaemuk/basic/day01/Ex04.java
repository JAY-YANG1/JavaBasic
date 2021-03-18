package jaemuk.basic.day01;
/**
 * 
 * 연습문제 실습
 *
 * 표현식 : expression
 * 계산이나 처리를 위해 작성하는 식을 의미
 * 수학에서 말하는 수식과 유사
 * 표현식의 중요한 특징은 평가evaluate임
 * 즉, 코드의 결과를 알아내는 과정을 의미
 * 
 */
public class Ex04 {
	public static void main(String[] args) {
		
		int x, y, z, s ,v0, s0, g, t;
		int result;
		
		x = 8;
		y = 5;
		z = 8;
		s0 = 20;
		v0 = 15;
		g = 10;
		t = 5;
		
		result = 3 * x;  // 3x
		
		System.out.print("3x = ");
		System.out.println(result);
		
		result = (3 * x) + y; // 3x + y
		
		System.out.print("3x + y = ");
		System.out.println(result);
		
		result = (x + y) / 7;
		
		System.out.print("(x + y) / 7 = ");
		System.out.println(result);
		
		result = (3 * x + y) / (z + 2);
		
		System.out.print("(3 * x + y) / (z + 2) = ");
		System.out.println(result);
		
		result = s0 + v0 * t + (1 / 2) * g * (t ^ 2);
		
		System.out.print("s0 + v0 * t + (1 / 2) * g * (t ^ 2) = ");
		System.out.println(result);
	}

}
