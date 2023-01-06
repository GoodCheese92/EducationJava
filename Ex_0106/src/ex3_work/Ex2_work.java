package ex3_work;

public class Ex2_work {
	public static void main(String[] args) {
		// 배열 arr에 담긴 값 중 가장 큰 값을 출력
		// 결과 : 19
		
		int[] arr = new int[6];
		arr[0] = 4;
		arr[1] = 13;
		arr[2] = 7;
		arr[3] = 19;
		arr[4] = 1;
		arr[5] = 15;
		
		int a = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(a<arr[i]) {
				a = arr[i];
			}

		}
		System.out.println("가장 큰 수 : " + a);
		
	} // end of main
} // end of class
