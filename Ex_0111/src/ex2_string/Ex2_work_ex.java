package ex2_string;

import java.util.Scanner;

public class Ex2_work_ex {
	public static void main(String[] args) {
		// Ű���忡�� �ƹ����̳� �Է¹ް� �ҹ��� a�� ������ ���
		
		// �Է� : ASDdsgmpgmsdpogsdpogsdmpgs
		// a�� ���� : 3
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		System.out.print("�Է� : ");
		String str = sc.next();
		
		// �Է� ���� ���ڿ��� ���̸�ŭ for���� �ݺ�
		for(int i = 0; i<str.length(); i++) {
			
			// a�� ã�Ƴ� �� ���� ī��Ʈ�� ����
			if(str.charAt(i)=='a') {
				count++;
			}
		}// for
		
		System.out.println("a�� ���� : "+count);
		
		
		
	} // end of main
} // end of class
