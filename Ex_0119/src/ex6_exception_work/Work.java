package ex6_exception_work;

import java.util.Scanner;

public class Work {
	public static void main(String[] args) {
		// Ű���忡�� ������ �ް�
		// �������� ������ �ƴ����� �Ǵ��Ͻÿ�.
		
		// ���� : 10
		// ��� : 10
		
		// ���� : aaa
		// aaa ��(��) ������ �ƴմϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		
		String error = sc.next();
		
		try {
			int num = Integer.parseInt(error);
			System.out.println("��� : "+num);
		} catch (Exception e) {
			System.out.println(error+"��(��) ������ �ƴմϴ�.");
		}
		
	} // end of main
} // end of class
