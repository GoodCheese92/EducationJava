package ex2_string;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
		// 회문수 판단하기
		// 회문수란 앞으로 읽어도 뒤에서 읽어도 똑같이 읽히는 숫자

		// 값 : a1221a
		// a1221a 은(는) 회문수입니다.

		// 값 : abc
		// abc 은(는) 회문수가 아닙니다.

		Scanner sc = new Scanner(System.in);
		System.out.print("값 : ");
		String str = sc.next();

		String[] str_arr1 = str.split("");

		// str_arr1 배열 확인
		for (int i = 0; i < str_arr1.length; i++) {
			System.out.print(str_arr1[i] + " ");
		}// for
		System.out.println();            
		
		String[] str_arr2 = new String[str_arr1.length];

		// str_arr2 배열에 str_arr1울 거꾸로 대입
		for (int i = 0; i < str_arr1.length; i++) {
			str_arr2[str_arr1.length - 1 - i] = str_arr1[i];

		}//for

		// 같은지 비교(반까지만)
		for (int i = 0; i < str_arr1.length / 2; i++) {
			if (str_arr1[i].equals(str_arr2[i])) {
				if (i == str_arr1.length / 2 - 1) {
					System.out.println(str + "은(는) 회문수입니다.");
					break;
				}
			} else {
				System.out.println(str + "은(는) 회문수가 아닙니다.");
				break;
			}
		} //for

	} // end of main
} // end of class
