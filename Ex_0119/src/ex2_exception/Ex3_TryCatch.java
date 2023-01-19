package ex2_exception;

import java.util.Scanner;

public class Ex3_TryCatch {
	public static void main(String[] args) {
		// 스캐너를 통해서 키보드에서 값을 입력받고
		// 정수인지 아닌지 판단하시오.

		// 정수 : 100
		// 결과 : 100

		// 정수 : a
		// 정수만 입력 해주세요.

		Scanner sc = new Scanner(System.in);


		System.out.print("정수 : ");

		try {
			int num = sc.nextInt();
			System.out.println("결과 : " + num);
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("정수만 입력 해주세요.");
		}


	} // end of main
} // end of class
