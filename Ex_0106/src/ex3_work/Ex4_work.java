package ex3_work;

import java.util.Scanner;

public class Ex4_work {
	public static void main(String[] args) {
		// �� ���� �ִ�����, �ּҰ���� ���ϱ�
		Scanner sc = new Scanner(System.in);

		System.out.print("��1�� �Է��ϼ��� : ");
		int a = sc.nextInt();
		System.out.print("��2�� �Է��ϼ��� : ");
		int b = sc.nextInt();

		int ss = 0;
		
		if(a>b) {
			int c = 0;
			c = a;
			a = b;
			b = c;
		}
		// ���ؾ� ����
		// boltang22@gmail.com
		
		for(int i = a; i >= 1; i--) {
			if(a%i == 0 && b%i == 0) {
				ss = i;
				break;
			}
		}
		
		System.out.println("�ִ����� : " + ss);
		
		System.out.println("�ּҰ���� : " + (a*b/ss));

	} // end of main
} // end of class
