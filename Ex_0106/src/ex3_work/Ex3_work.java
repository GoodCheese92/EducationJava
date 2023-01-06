package ex3_work;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
		// 키보드에서 정수 값을 입력받고, 입력받은 숫자가 소수인지 판단하시오.
		// 단, 키보드에서 1을 받았다면 '소수가 아님'을 출력해야 한다.

		// 값 : 5
		// 5은(는) 소수입니다.

		// 값 : 6
		// 6은(는) 소수가 아닙니다.

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 2) {
			for (int i = 2; i < num; i++) {
				
				if (num % i == 0) {
					System.out.println(num + "은(는) 소수가 아닙니다.");
					break;
				}else if(num == (i+1)) {
					System.out.println(num + "은(는) 소수입니다.");
				}
				
			}
		
		}else if(num == 2){
			System.out.println(num + "은(는) 소수입니다.");
		}else {
			System.out.println("소수가 아님");
		}

	} // end of main
} // end of class
