package ex5_thread;

import java.util.Scanner;

public class TMain {
	public static void main(String[] args) {
		// Ű���忡�� ���� �ް�
		// 1�ʿ� 1�� ���ҵǴ� ���� ����ϴٰ� 0�� �Ǿ��� �� �����带 ����
		
		// �� : 5
		// 5
		// 4
		// 3
		// 2
		// 1
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� : ");
		int x = sc.nextInt();
		T1 t1 = new T1(x);
		t1.start();
		
		
	} // end of main
} // end of class
