package ex4_work;

import java.util.ArrayList;
import java.util.Scanner;

public class WordGameMain_ex {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		String[] data = { "apple", "banana", "grape", "orange" };

		// �Ķ���ͷ� �Ѿ ���� �ּҰ� �Ѿ�� ������ ���ο����� ���Ѵ�.
		WordGame_ex wg = new WordGame_ex(arr, data);
		wg.start(); // ������ ����

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(arr);
			System.out.print(">>");
			String in = sc.next();

			if (arr.contains(in)) {
				arr.remove(in); // �ܾ� ����
			}

			// ���� ���� ����
			if (arr.size() == 0) {
				System.out.println("Ŭ����!!");
				wg.setPlaying(false); // ������ ����
				break;
			}

		} // while

	} // end of main
} // end of class
