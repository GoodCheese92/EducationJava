package ex4_work;

import java.util.Scanner;

public class UpdownMain_ex {
	public static void main(String[] args) {
		// ����� �ڵ�
		// �Է¹��� ���� UP, DOWN, ���������� �Ǵ�
		
		Scanner sc = new Scanner(System.in);
		Updwon_ex ud = new Updwon_ex();
		
		while(true) {
			// up, down �� ����ó��
			// ������ ��� while���� ����������.
			System.out.print("���� : ");
			int n = sc.nextInt();
			boolean res = ud.checkReusult(n);
			
			if(res) { // res == true(if ������ boolean ������ �׳� ����ص� �ȴ�) 
				// ������ ���� ���
				break;	// while���� ����������.
			}
			
			
		} // while
		
		
	} // end of main
} // end of class
