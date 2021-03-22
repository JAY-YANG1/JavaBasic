package jaemuk.basic.day05;

import java.util.Scanner;

public class CardCheck {

	public static void main(String[] args) {
		// 신용카드 번호를 보고
		// 어떤 종류와 은행인지 알려주는 프로그램
		// 3 : JCB카드
		// 4 : Visa카드
		// 5 : Master카드
		
		// 문자열.charAt(자릿수) : 지정한 자릿수의 문자하나 추출
		// 문자열.substring(시작, 끝) : 지정한 시작위치에서 끝 -1 위치의 문자들 추출
		
		String cardNumber;
		String cardtype = "";
		String cardbank = "";
		String fmt = "카드종류는 %s 이고요, 은행은 %s 입니다.";
		String result = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("카드번호를 입력해주세요 ");
		cardNumber = sc.next().substring(0, 6);
		
		//if (cardNumber.charAt(0) == '3') {
		//	cardtype = "JCB 카드";
		//} else if (cardNumber.charAt(0) == '4') {
		//	cardtype = "Visa 카드";
		//} else if (cardNumber.charAt(0) == '5')
		//	cardtype = "Master 카드";
		
		switch(cardNumber.charAt(0)) {
		case '3' : cardtype = "JCB 카드"; break;
		case '4' : cardtype = "Visa 카드"; break;
		case '5' : cardtype = "Master 카드"; break;
		} // switch
		
		//System.out.println(cardtype);
		
		
		switch(cardNumber) {
		case "356317" : cardbank = "NH 농협카드"; break;
		case "356901" : cardbank = "신한카드"; break;
		case "356912" : cardbank = "KB 국민카드"; break;
		case "404825" : cardbank = "비씨카드"; break;
		case "348676" : cardbank = "신한카드"; break;
		case "457973" : cardbank = "국민은행"; break;
		case "515594" : cardbank = "신한카드"; break;
		case "524353" : cardbank = "외환카드"; break;
		case "540926" : cardbank = "국민은행";
		} //switch
		
		System.out.printf(fmt, cardtype, cardbank);
		
		
		

	} // main

} //class
