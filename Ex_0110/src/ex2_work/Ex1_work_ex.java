package ex2_work;

import java.util.Scanner;

public class Ex1_work_ex {
	public static void main(String[] args) {
		// �Ǻ���ġ ����
		// Ű���忡�� �Է¹��� �� ��ŭ �Ǻ���ġ ���� ����ϱ�
		
		// �Է� : 7
		// 1 1 2 3 5 8 13
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = 1;
		int num2 = 0;
		int num3 = 0;
		
		System.out.print("�Է� : ");
		int count = sc.nextInt();
		
		for(int i=0; i<count; i++) {
			num2 = num3;
			num3 = num1;
			num1 = num2 + num3;
			System.out.printf("%d ", num3);
			
			
		} // for
		
		
		
	} // end of main
} // end of class
