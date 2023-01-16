package ex7_work;

import java.util.Scanner;

public class VendingMain {
	public static void main(String[] args) {
		Vending v1 = new Vending();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert Coin : ");
		int money = sc.nextInt();
		
		v1.showCan(money);
		
		System.out.println("-----------------------");
		System.out.print(">> ");
		String name = sc.next();
		int balance = v1.selectCan(name, money);
		System.out.println("ภÜพื : "+balance);
	} // end of main
} // end of class
