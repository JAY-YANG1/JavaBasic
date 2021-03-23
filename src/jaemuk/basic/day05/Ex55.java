package jaemuk.basic.day05;

public class Ex55 {

	public static void main(String[] args) {
		
		int[] array;
		array = new int[10];
		
		for(int i = 0; i < 10; ++i) {
			array[i] = i+1;
		}
		
		for(int l = 0; l < 10; ++l) {
			System.out.print(array[l] + " ");
		}

	} // main

} // class
