package ex4_work;

import java.util.Scanner;

public class WordGameMain {
	public static void main(String[] args) {
		// 3�ʿ� �ѹ� �� ArrayList�� �ܾ �߰���
		// �Է��� �޾Ƽ� ArrayList�� �ִ� �ܾ �Է� �� ����
		// ���� ���� �Ϸ��ϸ� Ŭ����!!
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
			System.out.print("�Է� : ");
			String remove = sc.next();
			wg.remove(remove);
		}

		System.out.println("Ŭ����!!");

	} // end of main
} // end of class
