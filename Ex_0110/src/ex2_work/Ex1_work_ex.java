package ex2_work;

import java.util.Scanner;

public class Ex1_work_ex {
	public static void main(String[] args) {
		// 피보나치 수열
		// 키보드에서 입력받은 값 만큼 피보나치 수열 출력하기
		
		// 입력 : 7
		// 1 1 2 3 5 8 13
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = 1;
		int num2 = 0;
		int num3 = 0;
		
		System.out.print("입력 : ");
		int count = sc.nextInt();
		
		for(int i=0; i<count; i++) {
			num2 = num3;
			num3 = num1;
			num1 = num2 + num3;
			System.out.printf("%d ", num3);
			
			
		} // for
		
		
		
	} // end of main
} // end of class
