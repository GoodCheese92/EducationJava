package ex6_random;

import java.util.Random;

public class Ex6_Random {
	public static void main(String[] args) {
		// ������ ������ִ� Ŭ���� Random
		Random rnd = new Random();

		// 1~3 ������ ����
		// rnd.nextInt(������ ����-���� ���� ���� ����) + ���� ��
		int num = rnd.nextInt(3) + 1;
		System.out.println(num);

		// 2~5 ������ ����
		int num1 = rnd.nextInt(4) + 2;
		System.out.println(num1);

		// 12345 ~ 34567 ������ ����
		// rnd.nextInt(���� - ���ۼ� + 1) + ���ۼ�;
		int num2 = rnd.nextInt(34567 - 12345 + 1) + 12345;
		System.out.println(num2);
		
		System.out.println("-----------------------------");
		
		// A ~ Z ������ ���ĺ��� �������� ��µǵ��� �ϼ���.
		// ���� : 'H'
		char ch = (char)(rnd.nextInt('Z'-'A' + 1)+'A');
		System.out.println(ch);
		int alpha = rnd.nextInt('Z'-'A'+1) + 'A';
		System.out.println((char)alpha);
		
		

	} // end of main
} // end of class
