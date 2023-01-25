package ex3_work;

import java.util.Scanner;

public class Work_ex {
	public static void main(String[] args) {
		// 아래와 같은 결과를 출력하되,
		// try-catch 구문을 사용하지 않고 코드를 작성해보시오.

		// 정수 : 123
		// 123은(는) 정수입니다.

		// 정수 : ab91
		// ab91은(는) 정수가 아님
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		String str = sc.next();
		
		Work_ex1 work = new Work_ex1();
		String answer = work.isNumber(str);
		
		System.out.println(answer);
		

	} // end of main
} // end of class
