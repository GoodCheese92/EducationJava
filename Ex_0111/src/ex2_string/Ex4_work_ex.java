package ex2_string;

import java.util.Scanner;

public class Ex4_work_ex {
	public static void main(String[] args) {
		String[][] actor = { { "[song]", "����", "����", "����" }, { "[lee]", "��λ�", "�����ڵ�", "����" },
				{ "[ryu]", "�û���", "��Ű", "Ÿ¥" } };

		// �˻��� ��� : song
		// [song]
		// ����
		// ����
		// ����
		// --------------------�˻��� �ùٸ��� �� ���

		// �˻��� ��� : park
		// �ش� ���� �����ϴ�.

		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� ��� : ");
		String name = sc.next();
		
		int count = 0;
		
		for(int i = 0; i<actor.length; i++) {
			if(actor[i][0].equalsIgnoreCase("["+name+"]")) {	// �����ϰ� �迭�� []�� ����°� �ƴ϶� ���ϴ� ���� +�� �̿��ؼ� �ϸ� �����ϴ�.
				for(int j = 0; j<actor[i].length; j++) {
					System.out.println(actor[i][j]);
					
				} // inner
			}else {
				count++;
				if(count == actor.length) {
					System.out.println("�ش� ����� �̷��� ��ϵǾ� ���� �ʽ��ϴ�.");					
				}
			}
			
		} // outer
		
		
	} // end of main
} // end of class
