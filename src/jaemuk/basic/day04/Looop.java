package jaemuk.basic.day04;

public class Looop {
	public static void main(String[] args) {
		// while
		// 특정조건을 만족할 때까지 계속해서 주어진 명령을 수행
		// 초기식
		// while(조건식) {
		//    반복코드
		//     증감식
		//}
		
		// 조건식이 처음부터 false 인 경우
		// while은 코드를 반복실행하지 않음
		// 반면, do - while 문은 일단 코드를 먼저 실행하고 
		// 조건을 검사하기 때문에
		// 조건식이 false 라도 
		// 최소 1번정도는 코드를 실행할 수 있음
		
		
		// ex) 1 ~ 10까지 정수출력 v1 - 반복문 사용
		int i = 1;    // 초기식
		while(i <= 10) { // 조건이 참이면 반복실행(조건식)
			System.out.print(i + " ");
			i += 1; // 증감식
		}
		
		System.out.println("");  // 줄바꿈
		
		// ex) 1 ~ 50 사이 홀수 출력
		i = 1;
		while(i <= 50) {
			System.out.print(i + " ");
			i += 2;
		}
		
		System.out.println("");  // 줄바꿈
		
		// ex) 1 ~ 50 사이 짝수 출력
		i = 2;
		while(i <= 50) {
			System.out.print(i + " ");
			i += 2;
		}
		
		System.out.println("");  // 줄바꿈
		
		// ex) 1 ~ 100 사이 총합 구해서 출력 v1
		int sum = 0;
		i = 1;
		while(i <= 100) {
			sum += i;
			++i;
		}
		System.out.println(sum);
		
		// 가우스 덧셈공식을 이용하면
		// 특정범위내의 모든 수의 합을 편리하게 구할 수 있음
		// 총합 : sum, 시작범위 : i, 끝 범위 : j
		// sum = (i + j) * j / 2
		// sum = (i + j) * (j - i + 1) / 2
		i = 1;
		int j = 100;
		sum = (i + j) * j / 2;
		System.out.println(sum);
		
		// ex) 1 ~ 99 까지의 총합을 구해서 출력
		// 단, 가우스 덧셈공식을 이용하세요
		j = 99;
		sum = (j + 1) * (j / 2) + (j + 1) / 2;
		System.out.println(sum);
		
	}

}
