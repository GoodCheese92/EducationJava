package ex3_work;

import java.util.Scanner;

public class Ex4_work {
	public static void main(String[] args) {
		// 두 수의 최대공약수, 최소공배수 구하기
		Scanner sc = new Scanner(System.in);

		System.out.print("수1을 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("수2을 입력하세요 : ");
		int b = sc.nextInt();

		int ss = 0;
		
		if(a>b) {
			int c = 0;
			c = a;
			a = b;
			b = c;
		}
		// 현준씨 메일
		// boltang22@gmail.com
		
		for(int i = a; i >= 1; i--) {
			if(a%i == 0 && b%i == 0) {
				ss = i;
				break;
			}
		}
		
		System.out.println("최대공약수 : " + ss);
		
		System.out.println("최소공배수 : " + (a*b/ss));

	} // end of main
} // end of class
