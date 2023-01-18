package ex6_work;

import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {
		String[] strArr = { "HOPE", "APPLE", "JAVA" };

		// strArr�� ��� �����ϳ��� ���
		// �������� �� �����Ѵ�.
		// �� ���ĵ� ������ ������ �����ϰ�
		// ������ �ܾ ������ �ڵ带 �ۼ�

		// ���� : AAJV
		// ���� : JAAV
		// JAAV��(��) ����...
		// ���� : JAVA
		// JAVA ����!

		Work w = new Work();

		String question = w.getSelect(strArr);
		System.out.println(question);
		System.out.println("���� : " + w.getRandom(question));

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("���� : ");
			String answer = sc.next();

			if (w.getResult(question, answer)) {
				System.out.println(answer + " ����!");
				break;
			} else {
				System.out.println(answer+"��(��) ����...");
			}

		}

	} // end of main
} // end of class
