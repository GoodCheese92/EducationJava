package ex1_scanner;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		// Ű���忡�� n1�� n2 ������ ���� ���� ���� �Է¹޴´�.
		// n1���� n2������ ���� ���.
		// ū ���� ���� �Է¹޾Ƶ� ����� ���ƾ� �Ѵ�.

		// ��1 : 1
		// ��2 : 5
		// ��� : 15

		// ��1 : 5
		// ��2 : 1
		// ��� : 15

		Scanner sc = new Scanner(System.in);

		System.out.println("�� �� ������ ���� ���Ͻÿ�.");
		System.out.print("��1(����)�� �Է��ϼ��� : ");
		int n1 = sc.nextInt();
		System.out.print("��2(����)�� �Է��ϼ��� : ");
		int n2 = sc.nextInt();

		int sum = 0;

		if (n1 < n2) {
			for (int i = n1; i <= n2; i++) {
				sum += i;
			}
		} else if (n1 > n2) {
			for (int i = n2; i <= n1; i++) {
				sum += i;
			}
		} else {
			sum = n1;
		}

		System.out.println("�� ���� : " + sum);

		System.out.println("---------------------------------");
		
		// ��� 2
		System.out.print("��1(����)�� �Է��ϼ���. : ");
		n1 = sc.nextInt();
		System.out.print("��2(����)�� �Է��ϼ���. : ");
		n2 = sc.nextInt();
		
		int temp = 0;
		sum = 0;
		
		if(n1 > n2) {
			temp = n1;
			n1 = n2;
			n2 = temp;			
		}
		for(int i=n1; i<=n2; i++) {
			sum += i;
		}
		
		System.out.println("�� ���� : "+sum);
		
		System.out.println("----------------------------------");
		
		// ����� �ڵ�
		System.out.print("��1 : ");
		n1 = sc.nextInt();
		System.out.print("��2 : ");
		n2 = sc.nextInt();
		
		int result = 0;
		
		// �������� �� ��ȯ
		// �ӽ� ������ �ϳ� ���� ����
		if(n1>n2) {	
			int n3 = n1;
			n1 = n2;
			n2 = n3;
		}
		
		for(int i = n1; i<=n2; i++) {
			result += i;
		}
		
		System.out.println("��� : "+result);
		
		
		
	} // end of main
} // end of class
