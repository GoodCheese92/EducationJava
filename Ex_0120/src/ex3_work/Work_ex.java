package ex3_work;

import java.util.Scanner;

public class Work_ex {
	public static void main(String[] args) {
		// �Ʒ��� ���� ����� ����ϵ�,
		// try-catch ������ ������� �ʰ� �ڵ带 �ۼ��غ��ÿ�.

		// ���� : 123
		// 123��(��) �����Դϴ�.

		// ���� : ab91
		// ab91��(��) ������ �ƴ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		String str = sc.next();
		
		Work_ex1 work = new Work_ex1();
		String answer = work.isNumber(str);
		
		System.out.println(answer);
		

	} // end of main
} // end of class
