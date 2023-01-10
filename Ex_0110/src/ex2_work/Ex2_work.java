package ex2_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		// 홀수마방진 - 가로, 세로, 대각선으로 구한 합이 모두 같다.
		// 키보드에서 입력받은 값 만큼의 행과 열을 가지는 홀수 마방진 만들기
		// 홀수마방진 규칙 : 1. 1행 중간에는 항상 1이 찍힌다.
		// 2. 한 칸위 오른쪽으로 이동후 1 증가한 수가 찍힌다.(위(오른쪽)이 존재하지 않을 시 맨 밑(맨 왼)쪽으로 이동한다.)
		// 3. 이동 후 수가 존재한다면 밑으로 이동하여 1 증가한 수가 찍힌다.

		// 사이즈 : 3
		// 08 01 06
		// 03 05 07
		// 04 09 02
		// 이차원 배열 사용

		Scanner sc = new Scanner(System.in);
		System.out.print("마장진의 크기를 입력하세요(홀수) : ");
		int n = sc.nextInt();
		int count = 1;

		int a = 0;
		int b = n / 2;

		int[][] arr_t = new int[n][n];
		arr_t[a][b] = count++;

		while (count <= n * n) {

			// 두 번째 규칙
			if (a > 0) {
				a--;
			} else {
				a = n - 1;
			}
			if (b < n - 1) {
				b++;
			} else {
				b = 0;
			} // 두 번째 규칙 끝

			// 세 번째 규칙
			if (arr_t[a][b] == 0) {
				arr_t[a][b] = count++;
			} else {

				System.out.println(count);
				if (b > 0) {
					b--;
				} else {
					b = n - 1;
				} // if

				while (true) {
					if (a < n - 1) {
						a++;
					} else {
						a = 0;
					}
					if (arr_t[a][b] == 0) {
						arr_t[a][b] = count;
						break;
					} // 밑이 0이 될때까지 무한반복
				} // while

				count++;

			} // 세 번째 규칙 끝

			
		} // while

		for (int i = 0; i < arr_t.length; i++) {
			for (int j = 0; j < arr_t[i].length; j++) {
				System.out.printf("%02d ", arr_t[i][j]);
			}
			System.out.println();
		}

	} // end of main
} // end of class
