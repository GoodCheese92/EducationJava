package ex1_multi_array;

public class Ex4_multi_array {
	public static void main(String[] args) {
		// 2���� �迭 arr�� ��� ��� ���� �հ� ����� ���
		// �� �� : 110
		// ��� : 8.4(����� �Ҽ��� �� �ڸ����� ���)
		
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
