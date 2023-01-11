package ex2_string;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		// 키보드에서 아무값이나 입력받고 소문자 a의 갯수를 출력

		// 입력 : Asddfgafgnaoignoaasdfads
		// a의 갯수 : 3

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.next();
		int count = 0;

		while (true) {
			int x = str.indexOf('a');

			if (x == -1) {
				System.out.println("a의 갯수 : " + count);
				break;
			} else {
				count++;

				str = str.substring(x + 1);
			}

		}

//		String test = "abccvv";
//		System.out.println(test.indexOf('a'));
//		test = test.substring(test.indexOf('a') + 1);
//		System.out.println(test);
//		System.out.println(test.indexOf('a'));

	} // end of main
} // end of class
