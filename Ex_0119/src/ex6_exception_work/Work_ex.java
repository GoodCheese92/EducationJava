package ex6_exception_work;

import java.util.Scanner;

public class Work_ex {
	public static void main(String[] args) {
		// Ű���忡�� ������ �ް�
		// �������� ������ �ƴ����� �Ǵ��Ͻÿ�.

		// ���� : 10
		// ��� : 10

		// ���� : aaa
		// aaa ��(��) ������ �ƴմϴ�.

		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		String str = "";

		try {
			str = sc.next();
			int num = Integer.parseInt(str);
			System.out.println("��� : " + num);

		} catch (Exception e) {
			System.out.println(str + "��(��) ������ �ƴմϴ�.");
		}

	} // end of main
} // end of class
















