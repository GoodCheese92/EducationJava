package ex4_work;

import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {
		// 1 ~ 50 ������ ������ �߻���Ų��.
		// ���� Ŭ�������� �������� �Է� �޴´�.
		// �Է¹��� ���� up, down, ��������� �Ǵ�
		// ������ ��� main Ŭ������ while���� ������������ ó��
		
		// ���� : 30
		// down
		// ���� : 15
		// up
		// ���� : 25
		// 3ȸ ���� ����!!
		Scanner sc = new Scanner(System.in);
		
		Updown ud = new Updown();
		
		int count = 0;
		while(true) {
			// up, down �� ����ó��
			// ������ ��� while���� ����������.
			
			
			System.out.print("���� : ");
			int answer = sc.nextInt();
			
			int rnd = ud.rnd();
			
			count++;
			
			if(answer<rnd) {
				ud.up(answer);
			}else if(answer>rnd) {
				ud.down(answer);
			}else {
				ud.answer(answer);
				System.out.println(count+"ȸ ���� ����");
				break;
			}
			
		}
		
	} // end of main
} // end of class
