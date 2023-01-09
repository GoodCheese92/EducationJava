package ex3_work;

public class Ex2_work {
	public static void main(String[] args) {
		// 배열 arr에 담긴 값 중 가장 큰 값을 출력
		// 결과 : 19

		int[] arr = { 4, 13, 7, 19, 1, 15 };
//		int[] arr = new int[6];
//		arr[0] = 4;
//		arr[1] = 13;
//		arr[2] = 7;
//		arr[3] = 19;
//		arr[4] = 1;
//		arr[5] = 15;

		int a = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (a < arr[i]) {
				a = arr[i];
			}
		}
		System.out.println("가장 큰 수 : " + a);

//		for(int i=0; i<arr.length; i++) {
//			a = Math.max(arr[i], arr[i]);
//		}

//		for(int e : arr) {
//			
//		}

		System.out.println("--------------------------------");

		// 강사님 코드
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i]; // max = 13;
			}
		}
		System.out.println("가장 큰 수 : " + max);

		System.out.println("-----------------------------------");

		// arr이 가진 값을 오름차순으로 정렬 -> sort라는 함수도 사용 가능
		// 강사님 코드
		// 배열의 맨 처음부터 뒤에 있는 것들을 다 비교해서 스왑을 통해 최솟값을 맨 앞쪽으로 보내는 논리 
		for(int i=0; i<arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				if(arr[j]<arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			} // inner
		} // outer
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("-----------------------------");
		
		// 내 코드
		arr[0] = 4;
		arr[1] = 13;
		arr[2] = 7;
		arr[3] = 19;
		arr[4] = 1;
		arr[5] = 15;
		
		


	} // end of main
} // end of class
