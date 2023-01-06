package ex3_work;

public class Ex1_work {
	public static void main(String[] args) {
		// 배열 arr에 담겨 있는 모든 값들의 합을 출력
		// 결과 : 67
		
		// 선언과 생성을 한줄로 표기할 수 있다.		
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 24;
		arr[2] = 7;
		arr[3] = 16;
		arr[4] = 10;
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
		
		
	} // end of main
} // end of class
