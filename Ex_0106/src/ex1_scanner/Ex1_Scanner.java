package ex1_scanner;

import java.util.Scanner;

public class Ex1_Scanner {
	public static void main(String[] args) {
		// Ű���忡�� ���� �Է¹��� �� �ֵ��� �� �ִ� Ŭ����
		// ���̺귯�� Ŭ������ import ��Ű�� ���� �� : ctrl + shift + o
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int num = sc.nextInt();
		System.out.println("�Է¹��� �� : " + num);

		System.out.print("���� : ");
		String str = sc.next();
		System.out.println("��� : " + str);
	} // end of main
} // end of class
