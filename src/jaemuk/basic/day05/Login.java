package jaemuk.basic.day05;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// 키보드로 아이디, 비밀번호 입력해서
		// 로그인 성공여부를 출력하는 프로그램
		// 아이디 : abc123
		// 비밀번호 : 987xyz
		// 1. 아이디 x, 비밀번호 x - 로그인 실패!
		// 2. 아이디 o, 비밀번호 x - 비밀번호가 틀렸습니다!
		// 3. 아이디 x, 비밀번호 o - 아이디가 틀렸습니다!
		// 4. 아이디 o, 비밀번호 o - 로그인 되셨습니다!
		// => 입력값에 따른 결과처리가 복잡하므로 단순화 시킴
		// 입력처리가 복잡해지면 코드도 복잡하게 짤 수밖에 없
		// 즉, 1,2,3 =>로그인 실패, 4 => 로그인 성공

		// 변수 선언
		String userid;
		String pwd;
		String result;

		// 아이디/비번 입력받아 비교
		Scanner sc = new Scanner(System.in);

		System.out.print("아이디 : ");
		userid = sc.next();
		System.out.print("비밀번호 : ");
		pwd = sc.next();

		// 문자열 비교시 == 이 아닌 equals 메서드 사용할것!!

		//if (userid.equals("abc123")) { // 아이디를 올바르게 입력한 경우
		//if (pwd.equals("987xyz")) {
		//result = "로그인 되셨습니다!";
		//} else {
		//result = "비밀번호가 틀렸습니다!";
		//}
		//} else { // 아이디를 올바르게 입력하지 않은 경우
		//if (pwd.equals("987xyz")) {
		//result = "아이디가 틀렸습니다!";
		//} else {
		//result = "로그인 실패!";
		//}
		//}
		// 로그인 성공여부를 4가지 경우에 따라 작성 => 코드 복잡

		//if (userid.equals("abc123")) {
		//	if (pwd.equals("987xyz")) {
		//		result = "로그인 성공!";
		//	} else {
		//		result = "로그인 실패!";
		//	}
		//}
		// 로그인 성공여부를 3가지 경우에 따라 작성 => 코드 다소 단순

		if (userid.equals("abc123") && pwd.equals("987xyz")) {
			result = "로그인 성공!";
		} else {
			result = "로그인 실패!";
		}
		// 조건식들을 논리식으로 재작성 => 코드 다소 단순

		
		// 결과 출력

		System.out.println(result);

	} // main

} // class
