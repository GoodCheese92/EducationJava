package ex2_string;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
		// ȸ���� �Ǵ��ϱ�
		// ȸ������ ������ �о �ڿ��� �о �Ȱ��� ������ ����

		// �� : a1221a
		// a1221a ��(��) ȸ�����Դϴ�.

		// �� : abc
		// abc ��(��) ȸ������ �ƴմϴ�.

		Scanner sc = new Scanner(System.in);
		System.out.print("�� : ");
		String str = sc.next();

		String[] str_arr1 = str.split("");

		// str_arr1 �迭 Ȯ��
		for (int i = 0; i < str_arr1.length; i++) {
			System.out.print(str_arr1[i] + " ");
		}// for
		System.out.println();            
		
		String[] str_arr2 = new String[str_arr1.length];

		// str_arr2 �迭�� str_arr1�� �Ųٷ� ����
		for (int i = 0; i < str_arr1.length; i++) {
			str_arr2[str_arr1.length - 1 - i] = str_arr1[i];

		}//for

		// ������ ��(�ݱ�����)
		for (int i = 0; i < str_arr1.length / 2; i++) {
			if (str_arr1[i].equals(str_arr2[i])) {
				if (i == str_arr1.length / 2 - 1) {
					System.out.println(str + "��(��) ȸ�����Դϴ�.");
					break;
				}
			} else {
				System.out.println(str + "��(��) ȸ������ �ƴմϴ�.");
				break;
			}
		} //for

	} // end of main
} // end of class
