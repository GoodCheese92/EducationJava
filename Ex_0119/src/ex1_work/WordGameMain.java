package ex1_work;

import java.util.Scanner;

public class WordGameMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WordScramble ws = new WordScramble();
		String answer = ws.getAnswer(); // ����

		// ws���� ������ ������ �����ش�.
		String question = ws.getScrambleWord(answer);

		System.out.println("���� : " + question);

		while (true) {
			System.out.print("����? : ");
			String str = sc.next();

			// ����ڰ� �Է¹��� ���ڿ��� str�� ������ answer�� ���Ѵ�.
			if (str.equalsIgnoreCase(answer)) {
				System.out.println(answer + " ���� !!");
				break;
			} else {
				System.out.println(str + " ����...");
			}

		} // while

	} // end of main
} // end of class
