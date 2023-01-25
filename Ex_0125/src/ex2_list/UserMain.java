package ex2_list;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		// �̸� : aaa
		// ���� : 20
		// aaa / 20
		// ------------------
		// �̸� : bbb
		// ���� : 30
		// aaa / 20
		// bbb / 30
		// ------------------
		// �̸� : aaa
		// �̸��� �ߺ��˴ϴ�.
		// ---------------------------
		// �̸� :

		Scanner sc = new Scanner(System.in);

		ArrayList<User> list = new ArrayList<User>();

		outer: while (true) {
			// User ��üȭ�� while�� ������ ���°� ����Ʈ
			// while���� �� ������ new�� ���� �Ź� ��üȭ �Ǳ� ������ ���� ��� �ִ� ������ �޶�����.
			User u = new User();

			System.out.print("�̸� : ");
			String name = sc.next();

			// �̸� �ߺ�üũ
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getName().equals(name)) {
					System.out.println("�̸��� �ߺ��˴ϴ�.");
					System.out.println("--------------------------------");
					continue outer;
				}
			} // for

			System.out.print("���� : ");
			int age = sc.nextInt();

			u.setName(name);
			u.setAge(age);
			// u ��ü�� �ּҸ� �����ϸ鼭 0�� �濡 �߰���
			// ArrayList�� �ּҸ� �����ϱ� ������ �ٸ� �ڷ����� �����͸� �ѹ��� ���� �� �ִ�.
			list.add(u);

			// ��� ���
			for (int i = 0; i < list.size(); i++) {
				System.out.printf("%s / %d\n", list.get(i).getName(), list.get(i).getAge());
			}

			System.out.println("--------------------------------");

		} // while

	} // end of main
} // end of class
