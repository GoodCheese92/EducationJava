package ex3_work;

import java.util.Scanner;

public class Work {
	public static void main(String[] args) {
		// �Ʒ��� ���� ����� ����ϵ�,
		// try-catch ������ ������� �ʰ� �ڵ带 �ۼ��غ��ÿ�.
		
		// ���� : 123
		// 123��(��) �����Դϴ�.
		
		// ���� : ab91
		// ab91��(��) ������ �ƴ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		String input = sc.next();
		
		String answer = "";
		
		char[] ch = input.toCharArray();
		
		for(int i=0;i<ch.length;i++) {

			if(ch[i]>='0' && ch[i] <= '9') {
				answer += ch[i];
				if(i==ch.length-1) {
					System.out.println(answer+"��(��) �����Դϴ�.");
				}
			}else {
				System.out.println(input+"��(��) ������ �ƴմϴ�.");
				break;
			}
		} // for
		
		
		
		
		
		
	} // end of main
} // end of class
