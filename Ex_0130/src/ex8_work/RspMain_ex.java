package ex8_work;

import java.util.Random;
import java.util.Scanner;

public class RspMain_ex {
	public static void main(String[] args) {
		// ObjectStream����Ͽ� ���� �ذ��ϱ�!!
		// ��� ---------------------

		// id : aaa
		// 0�� 0�� 0��
		// ����(s) | ����(r) | ��(p) : r
		// ����� �̰���ϴ�.
		// 1�� 0�� 0��
		// ���� ��? y | n : n
		// ���� ����

		// id : aaa
		// 1�� 0�� 0��
		// ����(s) | ����(r) | ��(p) : s
		// �����ϴ�.
		// 1�� 1�� 0��
		// ���� ��? y | n : n
		// ���� ����

		Scanner sc = new Scanner(System.in);

		Rsp_ex rsp = new Rsp_ex();
		int win = 0;
		int lose = 0;
		int draw = 0;

		System.out.print("id : ");
		String id = sc.next();
		rsp.setId(id);

		// ���� �ε�
		GameLoad_ex gl = new GameLoad_ex();
		rsp = gl.scoreLoader(id);
		if (rsp == null) {
			rsp = new Rsp_ex();
			rsp.setId(id);
		} else {
			win = rsp.getWin();
			draw = rsp.getDraw();
			lose = rsp.getLose();
		}

		System.out.printf("%d�� %d�� %d��\n", win, draw, lose);

		while (true) {
			// ��ǻ�Ͱ� �������� �� ���� ���� ����
			// 0 : ����, 1 : ����, 2 : ��
			int random = new Random().nextInt(3);

			System.out.print("����(s) | ����(r) | ��(p) : ");
			String user = sc.next();

			int userCnt = 0;

			if (user.equalsIgnoreCase("s")) {
				userCnt = 0;
			} else if (user.equalsIgnoreCase("r")) {
				userCnt = 1;
			} else if (user.equalsIgnoreCase("p")) {
				userCnt = 2;
			} // while

			// ����� �� �Ǻ�
			if (userCnt - random == -2 || userCnt - random == 1) {
				System.out.println("����� �̰���ϴ�.");
				rsp.setWin(++win);
			} else if (userCnt - random == 0) {
				System.out.println("�����ϴ�.");
				rsp.setDraw(++draw);
			} else {
				System.out.println("����� �����ϴ�.");
				rsp.setLose(++lose);
			}

			System.out.printf("%d�� %d�� %d��\n", win, draw, lose);

			System.out.print("���� ��? y | n : ");
			String select = sc.next();

			if (!select.equalsIgnoreCase("y")) {
				System.out.println("���� ����");
				break;
			}

		} // while

		// ���� ���� �� rsp��ü�� ����
		GameSave_ex gs = new GameSave_ex();
		gs.scoreWriter(rsp);

	} // end of main
} // end of class
