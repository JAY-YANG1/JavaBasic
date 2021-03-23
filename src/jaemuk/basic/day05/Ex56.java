package jaemuk.basic.day05;

import java.util.Scanner;

public class Ex56 {

	public static void main(String[] args) {
		
		int[] array = new int[100];
		array[0] = 99;
		array[11] = 8;
		array[2] = 77;
		array[33] = 6;
		array[4] = 55;
		array[55] = 4;
		array[6] = 33;
		array[77] = 2;
		array[8] = 11;
		array[99] = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("번호를 입력해주세요 : ");
		int i = sc.nextInt();
		
		System.out.println(array[i]);
		
		

	}

}
