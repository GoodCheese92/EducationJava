package ex2_string;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		// Ű���忡�� �ƹ����̳� �Է¹ް� �ҹ��� a�� ������ ���

		// �Է� : Asddfgafgnaoignoaasdfads
		// a�� ���� : 3

		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String str = sc.next();
		int count = 0;

		while (true) {
			int x = str.indexOf('a');

			if (x == -1) {
				System.out.println("a�� ���� : " + count);
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
