package ex7_work;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		// 수1, 수2, 연산자를 Calculator의 getResult() 메서드로 전달하여
		// 결과를 출력하시오.
		
		// 수1 : 5
		// 수2 : 10
		// 연산자 : +
		// 5 + 10 = 15
		
		Scanner sc = new Scanner(System.in);
		
		
		Calculator c1 = new Calculator();
		System.out.print("수1 : ");
		int su1 = sc.nextInt();
		System.out.print("연산자(+, -, *, /, %) : ");
		String str = sc.next();
		System.out.print("수2 : ");
		int su2 = sc.nextInt();
		
		
		c1.getResult(su1, str, su2);
		
	} // end of main
} // end of class
