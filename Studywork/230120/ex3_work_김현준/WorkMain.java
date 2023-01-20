package ex3_work;

import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {

		// 정수: 123
		// 123은 정수입니다.

		// 정수: ab91
		// ab91은(는) 정수가 아님

		// try-catch구문을 사용하지 않고 코드를 작성해 보세요.

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		String str = sc.next();
		boolean isInt = true;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(!(c >= 48 && c <= 57)) {
				isInt = false;
				break;
			}
		}
		if(isInt) {
			System.out.println(str + "은 정수입니다.");
		} else {
			System.out.println(str + "은(는) 정수가 아닙니다.");
		}


	}
}
