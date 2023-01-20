package ex3_work;

import java.util.Scanner;

public class Work {
	public static void main(String[] args) {
		// 아래와 같은 결과를 출력하되,
		// try-catch 구문을 사용하지 않고 코드를 작성해보시오.
		
		// 정수 : 123
		// 123은(는) 정수입니다.
		
		// 정수 : ab91
		// ab91은(는) 정수가 아님
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		String input = sc.next();
		
		String answer = "";
		
		char[] ch = input.toCharArray();
		
		for(int i=0;i<ch.length;i++) {

			if(ch[i]>='0' && ch[i] <= '9') {
				answer += ch[i];
				if(i==ch.length-1) {
					System.out.println(answer+"은(는) 정수입니다.");
				}
			}else {
				System.out.println(input+"은(는) 정수가 아닙니다.");
				break;
			}
		} // for
		
		
		
		
		
		
	} // end of main
} // end of class
