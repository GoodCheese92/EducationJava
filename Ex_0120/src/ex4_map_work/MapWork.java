package ex4_map_work;

import java.util.HashMap;
import java.util.Scanner;

public class MapWork {
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
		System.out.print("pw : ");
		String pw = sc.next();

		if (map.containsKey(id)) {

			try {
				
				if (Integer.parseInt(pw) == map.get(id)) {
					System.out.println("�α��� ����!");
				} else {
					System.out.println("��й�ȣ ����ġ");
				}
				
			} catch (Exception e) {
				System.out.println("��й�ȣ ����ġ");
			} // try-catch

		} else {
			System.out.println("���̵� �������� �ʽ��ϴ�.");
		} // if

	} // end of main
} // end of class
