package ex1_multi_array;

public class Ex1_multi_array {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 6};
		
		// 다차원 배열
		// 1차원 배열이 2개 모이면 2차원 배열
		// 1차원 배열이 3개 모이면 3차원 배열
		// 앞에 []는 큰 방의 번호(개수) -> 1차원 배열의 개수 -> 행의 개수
		// 뒤에 []는 작은 방의 번호(개수) -> 2차원 배열의 개수 -> 열의 개수
		// 3차원 이상 배열을 생각 시 가지치기로 생각하면 좀 더 수월함
		int[][] test = new int[2][3]; // 실제로 값들을 넣는 것은 뒤에 지정한 [][] 배열이다.
		test[0][0] = 10;
		test[0][1] = 20;
		test[0][2] = 30;

		test[1][0] = 40;
		test[1][1] = 50;
		test[1][2] = 60;

		System.out.println("test[0][1] : " + test[0][1]);

		System.out.println("-----------------------------------");

		System.out.println("이차원 배열의 인덱스 번호");
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				System.out.print(i + "" + j + "\t");
			}
			System.out.println();
		}

		System.out.println("-----------------------------------");
		
		System.out.println("이차원 배열의 값");
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				System.out.print(test[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
	} // end of main
} // end of class
