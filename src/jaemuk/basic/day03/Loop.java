package jaemuk.basic.day03;

public class Loop {
	public static void main(String[] args) {
		
		// 반복문 Loop
		// 프로그램 내에서 똑같은 명령을 지정한 횟수만큼
		// 반복하여 수행하도록 작성하는 명령문
		// 사용빈도가 높은 명령어들 중 하나
		// for(횟수지정후 반복), while(특정 조건을 만족할 때까지 반복)
		
		// 인사말 출력 v1 - 1번만 출력
		System.out.println("Hello, World!!");
		
		// 인사말 출력 v2 - 3번만 출력
		System.out.println("Hello, World!!");
		System.out.println("Hello, World!!");
		System.out.println("Hello, World!!");
		
		// 인사말 출력 v2.5 - 5번만 출력
		System.out.println("Hello, World!!");
		System.out.println("Hello, World!!");
		System.out.println("Hello, World!!");
		System.out.println("Hello, World!!");
		System.out.println("Hello, World!!");
		
		
		// 인사말 출력 v3 - 대상 변경 후 5번 출력
		// World -> Java
		System.out.println("Hello, Java!!");
		System.out.println("Hello, Java!!");
		System.out.println("Hello, Java!!");
		System.out.println("Hello, Java!!");
		System.out.println("Hello, Java!!");
		
		// 반복 횟수에 따라 코드를 복붙하기에 번거롭고
		// 반복하는 내용이 바뀌면 수정하기도 번거롭고 귀찮음
		
		// for 문
		// 초기식, 조건식, 증감식을 이용해서 특정코드를
		// 지정한 횟수반큼 반복하도록 작성하는 명령문
		// for(초기식;조건식;증감식) {
		//      반복할 코드
		//}
		// ex) 1 ~ 10까지 정수출력 v1 - 반복문 사용 x
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		
		// ex) 1 ~ 10까지 정수출력 v2- 반복문 사용 o
		//for(int i = 1; i <= 10; i += 1) {
		for(int i = 1; i <= 10; ++i) {
			System.out.println(i);
		}
		
		// ex) 1 ~ 50 사이 홀수 출력
		for(int i = 1; i <= 50; i += 2) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		
		// ex) 1 ~ 50 사이 짝수 출력
		for(int i = 2; i<= 50; i += 2) {
			System.out.println(i + " ");
		}
		
		// ex) 1 ~ 100 사이 총합 구해서 출력 v1
		int sum = 0;
		for(int i = 1; i <= 100; ++i) {
				sum += i;
		}
		System.out.println("1부터 100 사이의 합은 " + sum);
		
		// ex) 1 ~ 100 사이 총합 구해서 출력 v2
		// 가우스 덧셈공식
		int i = 100;
		int sum2 = (i + 1) * (i / 2);
		System.out.println("1부터 100 사이의 합은 " + sum2);
		
		
			
		
		
	}

}
