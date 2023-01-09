package ex2_coin;

import java.util.Random;

public class Ex1_coin {
	public static void main(String[] args) {
		// 변수 money에 10 ~ 5000까지의 난수를 만들어 넣는다
		// 단, 1의 자리 숫자는 반드시 0으로 만들어지도록 한다.
		// 발생된 난수 money를 동전으로 바꿨을 때,
		// 500원, 100원, 50, 10원짜리 동전이 각각 몇 개 거슬러지는지 판단하는 코드를 구현
		// 단, 가능한 한 적은 수의 동전으로 거슬러 준다.

		// 금액 : 2590
		// 500원 : 5
		// 100원 : 0
		// 50원 : 1
		// 10원 : 4

		int[] coin = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		int money = 0;
		int max = 1000000;
		int min = 10;
		int[] temp = new int[coin.length];

		Random rnd = new Random();

		do {
			money = rnd.nextInt(max - min + 1) + min;
		} while (money % 10 != 0);

		System.out.println("총 금액 : " + money + "원");

		for (int i = 0; i < coin.length; i++) {
			temp[i] = money / coin[i];
			money %= coin[i];
		}

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] > 0) { // 필요한 동전만 출력
				if (i <= 3) {
					System.out.println(coin[i] + "원 지폐 : " + temp[i] + "개");
				} else {
					System.out.println(coin[i] + "원 동전 : " + temp[i] + "개");
				}
			}
		}

		System.out.println("-----------------------------------------------");

		// 강사님 코드
		money = rnd.nextInt(500) + 1;
		money *= 10;

		System.out.println("금액 : " + money + "원");

		for (int i = 0; i < coin.length; i++) {
			int res = money / coin[i];
			if (res > 0) { // 필요한 동전만 출력
				System.out.printf("%d원 : %d개\n", coin[i], res);
				money %= coin[i];
			}
		}

	} // end of main
} // end of class
