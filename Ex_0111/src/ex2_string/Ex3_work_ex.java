package ex2_string;

import java.util.Scanner;

public class Ex3_work_ex {
	public static void main(String[] args) {
		// ȸ���� �Ǵ��ϱ�
		// ȸ������ ������ �о �ڿ��� �о �Ȱ��� ������ ����

		// �� : a1221a
		// a1221a ��(��) ȸ���� �Դϴ�.

		// �� : abc
		// abc ��(��) ȸ������ �ƴմϴ�.

		Scanner sc = new Scanner(System.in);
		System.out.print("�� : ");
		String ori = sc.next(); // ���� ��

		String rev = "";	// null�̶�� �ʱ�ȭ �ϸ� nullcba�� �ٴ´�.

		// ���� ���ڿ� ori�� ����� rev ������ ����
		for (int i = ori.length() - 1; i >= 0; i--) {

			rev += ori.charAt(i);

		} // for

		if (!ori.equals(rev)) { // equals �տ� !�� ������ �ݴ�. ori�� rev�� �ٸ��� �̶� ��
			System.out.println(ori + "��(��) ȸ������ �ƴ�");
		} else {
			System.out.println(ori + "��(��) ȸ����");
		}

	} // end of main
} // end of class
