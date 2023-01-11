package ex2_string;

import java.util.Scanner;

public class Ex4_work {
	public static void main(String[] args) {
		String[][] actor = { { "[song]", "����", "����", "����" }, { "[lee]", "��λ�", "�����ڵ�", "����" },
				{ "[ryo]", "�û���", "��Ű", "Ÿ¥" } };

		// �˻��� ��� : song
		// [song]
		// ����
		// ����
		// ����
		// --------------------�˻��� �ùٸ��� �� ���

		// �˻��� ��� : park
		// �ش� ���� �����ϴ�.

		Scanner sc = new Scanner(System.in);

		System.out.print("�˻��� ��� �̸� : ");
		String name = sc.next();
		
		
		
		for (int i = 0; i < actor.length; i++) {
			int x = actor[i][0].indexOf('[');	// '['�� �ε��� ��ȣ
			int y = actor[i][0].indexOf(']');	// ']'�� �ε��� ��ȣ
			actor[i][0] = actor[i][0].substring(x + 1, y);	// '['�� �ε��� ��ȣ + 1���� ']'�� �ε��� ��ȣ �� ���� 
			if (actor[i][0].equalsIgnoreCase(name)) {
				for (int j = 0; j < actor[i].length; j++) {
					System.out.println(actor[i][j]);
				}
				break;
			} else if (i == actor.length - 1) {
				System.out.println("�ش� ���� �����ϴ�.");
			}
		}

	} // end of main
}
