package ex2_work;

import java.util.Scanner;

public class Ex2_work_ex {
	public static void main(String[] args) {
		// 키보드에서 입력받은 값 만큼의 행과 열을 가지는 홀수 마방진 만들기

		// 사이즈 : 3
		// 08 01 06
		// 03 05 07
		// 04 09 02
		
		// 2차원 배열의 값에 어떤 규칙에 맞게 값을 대입하고 싶을 때(순서대로가 아니고)
		// x축, y축으로 변수를 따로 만들어서 생각하면 편함
		
		Scanner sc = new Scanner(System.in);

		int[][] arr;
		int num = 1; // 시작수
		int y = 0; // 행(y)
		int x = 0; // 열(x)

		System.out.print("사이즈 : ");
		int size = sc.nextInt();

		x = size / 2;

		// 배열의 크기
		arr = new int[size][size];

		// 마방진을 그릴 while문
		while (num <= size * size) {

			arr[y][x] = num;

			if (num % size == 0) {
				y++;
			} else {
				y--;
				x++;
			}
			// 이동하는거 코드 먼저 짜고
			// array size가 넘어가는 것을 다시 코드를 짜주면 조금 쉽게 풀 수 있다.
			
			if (y < 0) {
				y = size - 1;
			}

			if (x >= size) {
				x = 0;
			}

			num++;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%02d ", arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		
		for(int i=0; i<arr.length; i++) {
			int sum1 = 0;
			int sum2 = 0;
			for(int j=0; j<arr[i].length; j++) {
				sum1 += arr[i][j];
			}
			System.out.println(i+"행 합 : "+sum1); // 각 행의 합
		}

	} // end of main
} // end of class
