package ex2_string;

import java.util.Scanner;

public class Ex3_work_ex {
	public static void main(String[] args) {
		// 회문수 판단하기
		// 회문수란 앞으로 읽어도 뒤에서 읽어도 똑같이 읽히는 숫자

		// 값 : a1221a
		// a1221a 은(는) 회문수 입니다.

		// 값 : abc
		// abc 은(는) 회문수가 아닙니다.

		Scanner sc = new Scanner(System.in);
		System.out.print("값 : ");
		String ori = sc.next(); // 원본 값

		String rev = "";	// null이라고 초기화 하면 nullcba로 붙는다.

		// 원본 문자열 ori를 뒤집어서 rev 변수에 저장
		for (int i = ori.length() - 1; i >= 0; i--) {

			rev += ori.charAt(i);

		} // for

		if (!ori.equals(rev)) { // equals 앞에 !가 붙으면 반대. ori와 rev가 다르면 이란 뜻
			System.out.println(ori + "은(는) 회문수가 아님");
		} else {
			System.out.println(ori + "은(는) 회문수");
		}

	} // end of main
} // end of class
