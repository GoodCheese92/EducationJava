package ex2_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		// Ȧ�������� - ����, ����, �밢������ ���� ���� ��� ����.
		// Ű���忡�� �Է¹��� �� ��ŭ�� ��� ���� ������ Ȧ�� ������ �����
		// Ȧ�������� ��Ģ : 1. 1�� �߰����� �׻� 1�� ������.
		// 2. �� ĭ�� ���������� �̵��� 1 ������ ���� ������.(��(������)�� �������� ���� �� �� ��(�� ��)������ �̵��Ѵ�.)
		// 3. �̵� �� ���� �����Ѵٸ� ������ �̵��Ͽ� 1 ������ ���� ������.

		// ������ : 3
		// 08 01 06
		// 03 05 07
		// 04 09 02
		// ������ �迭 ���

		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ũ�⸦ �Է��ϼ���(Ȧ��) : ");
		int n = sc.nextInt();
		int count = 1;

		int a = 0;
		int b = n / 2;

		int[][] arr_t = new int[n][n];
		arr_t[a][b] = count++;

		while (count <= n * n) {

			// �� ��° ��Ģ
			if (a > 0) {
				a--;
			} else {
				a = n - 1;
			}
			if (b < n - 1) {
				b++;
			} else {
				b = 0;
			} // �� ��° ��Ģ ��

			// �� ��° ��Ģ
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
					} // ���� 0�� �ɶ����� ���ѹݺ�
				} // while

				count++;

			} // �� ��° ��Ģ ��

			
		} // while

		for (int i = 0; i < arr_t.length; i++) {
			for (int j = 0; j < arr_t[i].length; j++) {
				System.out.printf("%02d ", arr_t[i][j]);
			}
			System.out.println();
		}

	} // end of main
} // end of class
