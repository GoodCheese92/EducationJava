package problem.standard_of_java.chapter5;

import java.util.Scanner;

public class Problem12 {
	public static void main(String[] args) {
		// �Ʒ��� ���� ����� �������� �Ͻÿ�.
		// Q1. chair�� ����? dmlwk
		// Ʋ�Ƚ��ϴ�. ������ �����Դϴ�.
		// Q2. computer�� ����? ��ǻ��
		// �����Դϴ�.
		// Q3. integer�� ����? ����
		// �����Դϴ�.
		// ��ü 3���� �� 2���� ���߼̽��ϴ�.
		
		String[][] q = {{"Q1. chair�� ����?", "����"}, {"Q2. computer�� ����?", "��ǻ��"}, {"Q3. integer�� ����?", "����"}};
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;

		for(int i=0; i<q.length; i++) {
			System.out.println(q[i][0]);
			System.out.print(">> ");
			String answer = sc.next();
			
			if(q[i][1].equals(answer)) {
				System.out.println("�����Դϴ�.");
				count++;
			}else {
				System.out.println("�����Դϴ�. ������ "+q[i][1]+"�Դϴ�.");
			}
		}
		System.out.println("��ü "+q.length+"���� �� "+count+"���� ���߼̽��ϴ�.");
		
		
	} // end of main
} // end of class
