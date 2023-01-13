package ex5_work;

import java.util.Scanner;

public class VendingMain {
	public static void main(String[] args) {
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

		// Vending class 선언
		Vending vd = new Vending();

		// 객체별 속성 입력
		String[][] can = { { "오렌지맛 환타", "3000" }, { "파인애플맛 환타", "3200" }, { "레몬맛 환타", "2800" }, { "제로콜라", "3500" },
				{ "콜라", "3200" }, { "사이다", "2600" }, { "제로사이다", "2700" }, { "미란다", "1600" }, { "에너지드링크", "5000" },
				{ "우유", "1000" } };

		// vending 클래스에 setCan 안함
		vd.setCan(can);

		// 전체 음료수 목록
		vd.show();
		System.out.println("--------------------");

		// 코인 입력
		System.out.print("Insert coin : ");
		int coin = sc.nextInt();
		System.out.println("--------------------");

		// 입력한 금액으로 살 수 있는 목록 출력
		vd.show(coin);
		System.out.println("--------------------");

		// 음료수 고르기
		do {
		System.out.print("구매할 음료수를 입력해 주세요 >> ");
		String select = sc.next();

		int balance = vd.select(select, coin);
		
		System.out.println("잔액 : " + balance + "원");
		
		if(coin != balance) {
			break;
		}
		}while(true);
	} // end of main
} // end of class
