package ex8_work;

import java.util.Scanner;

public class Purchase_ex {
	public static void main(String[] args) {
		int cream = 500;
		int shrimp = 700;
		int cola = 400;
		int money = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ݾ� : ");
		money = sc.nextInt();

		for (int i = 1; money - i * cream > 0; i++) {
			for (int j = 1; money - j * shrimp > 0; j++) {
				for (int k = 1; money - k * cola > 0; k++) {
					// ���� ���� ����� ������ �ݾ��� ���� ���
					if(money == i*cream+shrimp*j+cola*k) {
						System.out.printf("ũ���� : %d��, ����� : %d��, �ݶ� : %d��\n", i, j, k);
					}
				}
			}
		}

	} // end of main
} // end of class
