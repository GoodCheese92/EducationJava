package ex6_gugudan;

import java.util.Scanner;

public class GuguMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 : ");
		int dan = sc.nextInt();
		
		Gugu gugu = new Gugu();
		gugu.getGugudan(dan);
		// 클래스로 나눠서 하는 이유
		// 문제가 발생한 부분을 쉽게 알아차릴 수 있다.
		
	} // end of main
} // end of class
