package ex2_exception;

import java.util.Scanner;

public class Ex3_TryCatch {
	public static void main(String[] args) {
		// ��ĳ�ʸ� ���ؼ� Ű���忡�� ���� �Է¹ް�
		// �������� �ƴ��� �Ǵ��Ͻÿ�.

		// ���� : 100
		// ��� : 100

		// ���� : a
		// ������ �Է� ���ּ���.

		Scanner sc = new Scanner(System.in);


		System.out.print("���� : ");

		try {
			int num = sc.nextInt();
			System.out.println("��� : " + num);
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("������ �Է� ���ּ���.");
		}


	} // end of main
} // end of class
