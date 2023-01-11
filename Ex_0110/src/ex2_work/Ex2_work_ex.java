package ex2_work;

import java.util.Scanner;

public class Ex2_work_ex {
	public static void main(String[] args) {
		// Ű���忡�� �Է¹��� �� ��ŭ�� ��� ���� ������ Ȧ�� ������ �����

		// ������ : 3
		// 08 01 06
		// 03 05 07
		// 04 09 02
		
		// 2���� �迭�� ���� � ��Ģ�� �°� ���� �����ϰ� ���� ��(������ΰ� �ƴϰ�)
		// x��, y������ ������ ���� ���� �����ϸ� ����
		
		Scanner sc = new Scanner(System.in);

		int[][] arr;
		int num = 1; // ���ۼ�
		int y = 0; // ��(y)
		int x = 0; // ��(x)

		System.out.print("������ : ");
		int size = sc.nextInt();

		x = size / 2;

		// �迭�� ũ��
		arr = new int[size][size];

		// �������� �׸� while��
		while (num <= size * size) {

			arr[y][x] = num;

			if (num % size == 0) {
				y++;
			} else {
				y--;
				x++;
			}
			// �̵��ϴ°� �ڵ� ���� ¥��
			// array size�� �Ѿ�� ���� �ٽ� �ڵ带 ¥�ָ� ���� ���� Ǯ �� �ִ�.
			
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
			System.out.println(i+"�� �� : "+sum1); // �� ���� ��
		}

	} // end of main
} // end of class
