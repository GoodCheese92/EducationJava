package ex5_work;

import java.util.Scanner;

public class VendingMain_ex {
	public static void main(String[] args) {
		// 강사님 코드

		// 클래스배열 이용
		// 키보드에서 금액을 입력 받고
		// 해당범위 안에서 마실 수 있는 음료의 목록만 화면에 출력
		// 음료를 선택하면 제공 및 잔액을 반환

		// insert coin : 1000
		// 1000원을 입력하면 1000원으로 살 수 있는 것만 출력한다.
		// fanta - 1000
		// coke - 900
		// sider - 900
		// >> coke
		// coke 을(를) 선택하셨습니다.
		// 잔액 : 100원

		Scanner sc = new Scanner(System.in);
		Vending_ex ven = new Vending_ex();
		ven.canInit();

		System.out.print("Insert Coin : ");
		int money = sc.nextInt();

		ven.showCans(money); // 마실 수 있는 음료수의 목록

		System.out.print(">> ");
		String select = sc.next(); // 음료수 이름 입력

		// 음료 제공 및 잔돈 반환
		ven.outCan(select);

	} // end of main
} // end of class
