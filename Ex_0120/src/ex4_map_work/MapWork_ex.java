package ex4_map_work;

import java.util.HashMap;
import java.util.Scanner;

public class MapWork_ex {
	public static void main(String[] args) {
		// id : kim
		// pw : 3333
		// ��й�ȣ ����ġ

		// id : lim
		// pw : 1234
		// ���̵� �������� �ʽ��ϴ�.

		// id : park
		// pw : 2222
		// �α��� ����!

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("kim", 1111);
		map.put("park", 2222);
		map.put("Lee", 3333);

		Scanner sc = new Scanner(System.in);

		System.out.print("id : ");
		String id = sc.next();

		System.out.print("pwd : ");
		int pwd = sc.nextInt();

		if (!map.containsKey(id)) { // map.containsKey(id) == false
			System.out.println("���̵� �������� �ʽ��ϴ�.");
		} else {
			// ���̵� �����ϴ� ���.
			// Ű���忡�� id�� key���� ��ġ�ϴ� value���� �����ͼ� pwd ������ ��
			if (map.get(id) != pwd) {
				System.out.println("��й�ȣ ����ġ");
			} else {
				System.out.println("�α��� ����!");
			}
		}

	} // end of main
} // end of class
