package problem.standard_of_java.chapter6;

import java.util.Random;

public class Problem20 {
	// 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
	public static int[] shuffle(int[] arr) {
		Random rnd = new Random();
		int temp = 0;
		for(int i=0; i < arr.length; i++) {
			int x = rnd.nextInt(arr.length-i+1)+i;
			temp = arr[i];
			arr[i] = arr[x];
			arr[x] = temp;			
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
	
	
} // end of class
