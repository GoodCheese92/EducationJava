package ex1_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3_ArrayList {
	public static void main(String[] args) {
		// �߰� : abc
		// [abc]

		// �߰� : aabb
		// [abc, aabb]

		// �߰� : abc
		// �ߺ��� ���̵�

		// �߰� : exit
		// ����

		ArrayList<String> sList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		String str;
		outer: while (true) {

			System.out.print("�߰� : ");
			str = sc.next();

			if (str.equalsIgnoreCase("exit")) {
				System.out.println("�߰� ����!");
				break;
			}

			boolean isCheck = true;

			// ��� 1
			for (int i = 0; i < sList.size(); i++) {
				if (str.equals(sList.get(i))) {
					System.out.println("�ߺ��� ���̵�");
					isCheck = false;
					break;
				}
			}

			// ��� 2
			if (sList.contains(str)) {
				System.out.println("�ߺ��� ���̵�");
				continue outer;
			}

			// ��� 3
			for (int i = 0; i < sList.size(); i++) {
				if (str.equals(sList.get(i))) {
					System.out.println("�ߺ��� ���̵�");
					continue outer;
				}
			}

			if (isCheck) {
				sList.add(str);
			}

			System.out.println(sList);

		} // while

	} // end of main
} // end of class
