package ex3_account;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Atm atm = new Atm();
		
		Scanner sc = new Scanner(System.in);
		
		
		out : while(true) {
			System.out.println("1. 입     금 : ");
			System.out.println("2. 출     금 : ");
			System.out.println("3. 잔액확인 : ");
			System.out.println("etc.종   료 : ");
			System.out.print(">>");
			int select = sc.nextInt();
			
			switch(select) {
			case 1 :
				System.out.print("입금액을 입력해주세요 : ");
				int money = sc.nextInt();
				atm.deposit(money);
				break;
			case 2:
				System.out.print("출금액을 입력해주세요 : ");
				money = sc.nextInt();
				money = atm.withdraw(money);
				break;
			case 3:
				atm.balance();
				break;
			default:
				System.out.println("atm을 종료합니다.");
				break out;
			}
				
			
				
				
		} // while
	
	
	} // end of main
} // end of class
