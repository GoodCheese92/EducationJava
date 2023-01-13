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

		Vending[] vd = new Vending[10];
		
		// 객체 배열 생성
		for (int i = 0; i < vd.length; i++) {
			vd[i] = new Vending();
		}
		
		// 객체별 속성 입력
		String[] name = new String[vd.length];
		int[] money = { 5000, 3000, 2500, 2000, 1500, 1000 };

		vd[0].setMenu("1. 오렌지맛 환타");
		vd[1].setMenu("2. 파인애플맛 환타");
		vd[2].setMenu("3. 레몬맛 환타");
		vd[3].setMenu("4. 제로콜라");
		vd[4].setMenu("5. 콜라");
		vd[5].setMenu("6. 사이다");
		vd[6].setMenu("7. 제로사이다");
		vd[7].setMenu("8. 미란다");
		vd[8].setMenu("9. 에너지드링크");
		vd[9].setMenu("10. 우유");

		for (int i = 0; i < vd.length; i++) {

			if (vd[i].getMenu().contains("환타")) {
				vd[i].setMoney(money[4]);
			} else if (vd[i].getMenu().contains("콜라")) {
				vd[i].setMoney(money[1]);
			} else if (vd[i].getMenu().contains("사이다")) {
				vd[i].setMoney(money[2]);
			} else if (vd[i].getMenu().contains("미란다")) {
				vd[i].setMoney(money[3]);
			} else if (vd[i].getMenu().contains("에너지드링크")) {
				vd[i].setMoney(money[0]);
			} else if (vd[i].getMenu().contains("우유")) {
				vd[i].setMoney(money[5]);
			}
		}
		// 각 개체별 속성 입력 완료
		
		System.out.print("Insert coin : ");
		int coin = sc.nextInt();
		
		// 입력한 금액으로 살 수 있는 목록 출력
		for(int i=0; i<vd.length; i++) {
			vd[i].show(coin);
		}
		
		// 음료수 고르기
		System.out.print("구매할 음료수 번호를 입력해 주세요 >> ");
		int select = sc.nextInt();
		
		int balance = vd[select-1].select(coin);
		System.out.println("잔액 : "+balance+"원");
			
			
			
	} // end of main
} // end of class
