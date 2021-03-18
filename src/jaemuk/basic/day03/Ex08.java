package jaemuk.basic.day03;

public class Ex08 {
	public static void main(String[] args) {
		
		//가
		System.out.print(" May 13, 2021 fell on day number ");
		
		
		//나
		System.out.println(( (13 + (13 * 3 - 1) / 5 + 2021 % 100 + 2021 % 100 / 4 + 2021 / 400 
				- 2 * (2021 / 100) ) % 7 + 7) % 7);
		//특정연도-1의 12월31일의 요일 출력
		//0 : 일, 1 : 월, ... , 6 : 토
		//따라서, 특정연도의 1월1일의 요일을 출력하려면
		//계산식 결과에 +1을 해주면 됌
		
		//다
		System.out.print(" Check out this line  ");
		
		//라
		System.out.println(" //hello there " + '9' + 7);
		
		//마
		System.out.print( 'H' + 'I' + " is " + 1 + "more example");
		//H와 I 사이 산술 연산자로 인해
		//H와 I 가 숫자형으로 변환되어 + 연산이 수행
		
		//바
		System.out.print('H' + 6.5 + 'I' + " is " + 1 + "more example");
		
		//사
		//System.out.print("Print both of us", "Me too");
		System.out.print("Print both of us, Me too");
		
		//아
		System.out.print("Reverse " + 'I' + 'T' );
		
		//자
		System.out.print("No! Here is" + 1 + "more example" );
		
		//차
		// System.out.println("Here is " + 10 * 10) ) // that’s 100);
		System.out.println("Here is " + 10 * 10); // that’s 100);

		//카
		System.out.println( "Not x is " + true ); // that’s true.;
		
		//타
		//System.out.print(  );
		System.out.print("  ");
		//출력할 대상이 지정되지 않았으므로 오류발생
		
		//파
		//System.out.println;
		System.out.println();
		//괄호가 필요
		
		//하
		//System.out.print( "How about this one" ++ '?' + 'Huh?' );
		System.out.print( "How about this one" + '?' + "Huh?" );
		//문자열에 사용할 수 없는 증감연산자를 사용했음
		
		

	}

}
