package ex1_multi_array;

public class Ex4_multi_array {
	public static void main(String[] args) {
		// 2차원 배열 arr에 담긴 모든 값의 합과 평균을 출력
		// 총 합 : 110
		// 평균 : 8.4(평균은 소수점 한 자리까지 출력)
		
		int[][] arr = {	{2, 4, 11, 28},
						{5, 7, 10},
						{12, 17, 3, 6},
						{3, 2}	};
		
		
		int total = 0;
		float avg = 0;
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {

			for(int j=0; j<arr[i].length; j++) {
				total += arr[i][j];
				count++;
			}
			
			avg = (float)total/count;
			
		}
		
		System.out.printf("total : %d, avg : %.1f",total,avg);
		
		System.out.println("----------------------------------------");
	
		
//		for(int i=0; i<arr.length; i++) {
//			for(int j = 0; j<arr[i].length; j++) {
//				if(arr[i][j])
//			}
//		}
		
	} // end of main
} // end of class
