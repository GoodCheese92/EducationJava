package ex4_work;

import java.util.Scanner;

public class WordGameMain {
	public static void main(String[] args) {
		// 3초에 한번 씩 ArrayList에 단어가 추가됨
		// 입력을 받아서 ArrayList에 있는 단어를 입력 시 삭제
		// 전부 삭제 완료하면 클리어!!
		WordGame wg = new WordGame();

		Scanner sc = new Scanner(System.in);

		wg.start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		while (wg.getisCheck()) {
			wg.print();
			System.out.print("입력 : ");
			String remove = sc.next();
			wg.remove(remove);
		}

		System.out.println("클리어!!");

	} // end of main
} // end of class
