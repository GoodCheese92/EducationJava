package ex6_work;

import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {
		String[] strArr = { "HOPE", "APPLE", "JAVA" };

		// strArr에 담긴 문장하나를 골라서
		// 랜덤으로 재 정렬한다.
		// 재 정렬된 문장을 문제로 출제하고
		// 원래의 단어를 맞히는 코드를 작성

		// 문제 : AAJV
		// 정답 : JAAV
		// JAAV은(는) 오답...
		// 정답 : JAVA
		// JAVA 정답!

		Work w = new Work();

		String question = w.getSelect(strArr);
		System.out.println(question);
		System.out.println("문제 : " + w.getRandom(question));

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("정답 : ");
			String answer = sc.next();

			if (w.getResult(question, answer)) {
				System.out.println(answer + " 정답!");
				break;
			} else {
				System.out.println(answer+"은(는) 오답...");
			}

		}

	} // end of main
} // end of class
