package ex2_coin;

import java.util.Random;

public class Ex1_coin {
	public static void main(String[] args) {
		// ���� money�� 10 ~ 5000������ ������ ����� �ִ´�
		// ��, 1�� �ڸ� ���ڴ� �ݵ�� 0���� ����������� �Ѵ�.
		// �߻��� ���� money�� �������� �ٲ��� ��,
		// 500��, 100��, 50, 10��¥�� ������ ���� �� �� �Ž��������� �Ǵ��ϴ� �ڵ带 ����
		// ��, ������ �� ���� ���� �������� �Ž��� �ش�.

		// �ݾ� : 2590
		// 500�� : 5
		// 100�� : 0
		// 50�� : 1
		// 10�� : 4

		int[] coin = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		int money = 0;
		int max = 1000000;
		int min = 10;
		int[] temp = new int[coin.length];

		Random rnd = new Random();

		do {
			money = rnd.nextInt(max - min + 1) + min;
		} while (money % 10 != 0);

		System.out.println("�� �ݾ� : " + money + "��");

		for (int i = 0; i < coin.length; i++) {
			temp[i] = money / coin[i];
			money %= coin[i];
		}

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] > 0) { // �ʿ��� ������ ���
				if (i <= 3) {
					System.out.println(coin[i] + "�� ���� : " + temp[i] + "��");
				} else {
					System.out.println(coin[i] + "�� ���� : " + temp[i] + "��");
				}
			}
		}

		System.out.println("-----------------------------------------------");

		// ����� �ڵ�
		money = rnd.nextInt(500) + 1;
		money *= 10;

		System.out.println("�ݾ� : " + money + "��");

		for (int i = 0; i < coin.length; i++) {
			int res = money / coin[i];
			if (res > 0) { // �ʿ��� ������ ���
				System.out.printf("%d�� : %d��\n", coin[i], res);
				money %= coin[i];
			}
		}

	} // end of main
} // end of class
