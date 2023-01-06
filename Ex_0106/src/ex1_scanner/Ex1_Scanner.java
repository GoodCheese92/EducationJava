package ex1_scanner;

import java.util.Scanner;

public class Ex1_Scanner {
	public static void main(String[] args) {
		// 키보드에서 값을 입력받을 수 있도록 해 주는 클래스
		// 라이브러리 클래스를 import 시키고 싶을 때 : ctrl + shift + o
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();
		System.out.println("입력받은 값 : " + num);

		System.out.print("문장 : ");
		String str = sc.next();
		System.out.println("결과 : " + str);
	} // end of main
} // end of class
