package ex8_work;

import java.util.Scanner;

public class Purchase_ex {
	public static void main(String[] args) {
		int cream = 500;
		int shrimp = 700;
		int cola = 400;
		int money = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("소유한 금액 : ");
		money = sc.nextInt();

		for (int i = 1; money - i * cream > 0; i++) {
			for (int j = 1; money - j * shrimp > 0; j++) {
				for (int k = 1; money - k * cola > 0; k++) {
					// 가진 돈과 사려는 조합의 금액이 같을 경우
					if(money == i*cream+shrimp*j+cola*k) {
						System.out.printf("크림빵 : %d개, 새우깡 : %d개, 콜라 : %d개\n", i, j, k);
					}
				}
			}
		}

	} // end of main
} // end of class
