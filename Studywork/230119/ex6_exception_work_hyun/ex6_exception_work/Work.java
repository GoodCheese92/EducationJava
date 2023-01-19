package ex6_exception_work;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Work {
	public static void main(String[] args) {
		// 키보드에서 정수를 받고
		// 정수인지 정수가 아닌지를 판단하시오.
		
		// 정수가 제대로 받아졌다면
		// 정수 : 10
		// 결과 : 10
		
		// 정수 : aaa
		// aaa은(는) 정수가 아닙니다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		String err = sc.next();
		try {
			int num = Integer.parseInt(err);
			System.out.println("결과 : " + num);
		} catch (Exception e) {
			System.out.println(err + "은(는) 정수가 아닙니다.");
		}
	}
}
