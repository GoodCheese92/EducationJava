package ex4_work;

import java.util.ArrayList;
import java.util.Scanner;

public class WordGameMain_ex {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		String[] data = { "apple", "banana", "grape", "orange" };

		// 파라미터로 넘어간 것이 주소가 넘어갔기 때문에 메인에서도 변한다.
		WordGame_ex wg = new WordGame_ex(arr, data);
		wg.start(); // 쓰레드 시작

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(arr);
			System.out.print(">>");
			String in = sc.next();

			if (arr.contains(in)) {
				arr.remove(in); // 단어 삭제
			}

			// 게임 종료 시점
			if (arr.size() == 0) {
				System.out.println("클리어!!");
				wg.setPlaying(false); // 쓰레드 종료
				break;
			}

		} // while

	} // end of main
} // end of class
