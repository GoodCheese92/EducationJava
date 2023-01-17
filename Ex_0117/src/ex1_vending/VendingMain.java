package ex1_vending;

import java.util.Scanner;

public class VendingMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vending ven = new Vending();
		
		System.out.print("insert coin : ");
		int money = sc.nextInt();
		
		ven.showCans(money);
		
		System.out.print("¼±ÅÃ >> ");
		String select = sc.next();
		
		ven.outCan(select);
		
	} // end of main
} // end of class
