package ex7_work;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		// ��1, ��2, �����ڸ� Calculator�� getResult() �޼���� �����Ͽ�
		// ����� ����Ͻÿ�.
		
		// ��1 : 5
		// ��2 : 10
		// ������ : +
		// 5 + 10 = 15
		
		Scanner sc = new Scanner(System.in);
		
		
		Calculator c1 = new Calculator();
		System.out.print("��1 : ");
		int su1 = sc.nextInt();
		System.out.print("������(+, -, *, /, %) : ");
		String str = sc.next();
		System.out.print("��2 : ");
		int su2 = sc.nextInt();
		
		
		c1.getResult(su1, str, su2);
		
	} // end of main
} // end of class
