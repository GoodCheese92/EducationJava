package ex8_work;

import java.util.Scanner;

public class PMain {
	public static void main(String[] args) {
		Purchase[] p = new Purchase[3];

		String[][] InfoP = { { "农覆户", "500" }, { "货快兵", "700" }, { "妮扼", "400" } };

		for (int i = 0; i < p.length; i++) {
			p[i] = new Purchase(InfoP[i][0], Integer.parseInt(InfoP[i][1]));
			System.out.println(p[i].getName() + " - " + p[i].getPrice() + "盔");
		}

		System.out.println("--------------------------");
		Scanner sc = new Scanner(System.in);

		System.out.print("money : ");
		int money = sc.nextInt();

		for (int i = 1; i <= money / p[0].getPrice(); i++) {
			int balance = money;
			if (money - p[0].getPrice() * i <= 0) {
				break;
			}
			balance -= (p[0].getPrice() * i);
			for (int j = 1; j <= balance / p[1].getPrice(); j++) {
				int balance1 = balance;
				if (balance1 - p[1].getPrice() * j <= 0) {
					break;
				}
				balance1 -= (p[1].getPrice() * j);
//				System.out.println(i + " " + j + " " + balance + " " + balance1 % p[2].getPrice());
				if (balance1 % p[2].getPrice() == 0) {
					System.out.printf("农覆户 : %d俺, 货快兵 : %d俺, 妮扼 : %d俺\n", i, j, balance1 / p[2].getPrice());
				}

			} // inner

		} // outer

	} // end of main
} // end of class
