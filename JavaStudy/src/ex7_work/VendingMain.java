package ex7_work;

import java.util.Scanner;

public class VendingMain {
		public static void main(String[] args) {
			
			// 키보드에서 금액을 입력받고
			// 해당 금액 범위안에서 마실 수 있는 음료의 목록만 화면에 출력
			// 음료를 선택하면 제공 및 잔액을 반환
			// insert coin : 1000
			// 환타 - 1000
			// 콜라 - 900
			// 사이다 - 900
			// >> 콜라
			// 콜라 (을)를 선택하셨습니다.
			// 잔액 100원

			String[][] drinks = { { "코카콜라", "1800" }, { "코카제로", "2000" }, { "펩시", "1500" }, { "펩시제로", "1600" },
					{ "칠성사이다", "1600" }, { "칠성제로", "1800" }, { "데자와", "1200" }, { "데미소다", "1200" }, { "비타500", "1000" },
					{ "마운틴듀", "1100" } };
			
			Scanner sc = new Scanner(System.in);
			Vending vnd = new Vending();
			vnd.setDrk(drinks);
			vnd.showDrinks();
			
			System.out.print("insert coin >> ");
			int coin = sc.nextInt();
			
			while(true) {
				vnd.showDrinks(coin);
				System.out.printf(">> ");
				String drink = sc.next();
				if(vnd.chooseDrink(drink)) {
					break;
				}	
			}	
		}
	}

	// vending

