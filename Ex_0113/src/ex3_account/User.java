package ex3_account;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Atm atm = new Atm();
		
		Scanner sc = new Scanner(System.in);
		
		
		out : while(true) {
			System.out.println("1. ��     �� : ");
			System.out.println("2. ��     �� : ");
			System.out.println("3. �ܾ�Ȯ�� : ");
			System.out.println("etc.��   �� : ");
			System.out.print(">>");
			int select = sc.nextInt();
			
			switch(select) {
			case 1 :
				System.out.print("�Աݾ��� �Է����ּ��� : ");
				int money = sc.nextInt();
				atm.deposit(money);
				break;
			case 2:
				System.out.print("��ݾ��� �Է����ּ��� : ");
				money = sc.nextInt();
				money = atm.withdraw(money);
				break;
			case 3:
				atm.balance();
				break;
			default:
				System.out.println("atm�� �����մϴ�.");
				break out;
			}
				
			
				
				
		} // while
	
	
	} // end of main
} // end of class
