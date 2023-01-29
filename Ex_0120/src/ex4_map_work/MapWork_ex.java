package ex4_map_work;

import java.util.HashMap;
import java.util.Scanner;

public class MapWork_ex {
	public static void main(String[] args) {
		// id : kim
		// pw : 3333
		// 비밀번호 불일치

		// id : lim
		// pw : 1234
		// 아이디가 존재하지 않습니다.

		// id : park
		// pw : 2222
		// 로그인 성공!

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
			System.out.println("아이디가 존재하지 않습니다.");
		} else {
			// 아이디가 존재하는 경우.
			// 키보드에서 id와 key값이 일치하는 value값을 가져와서 pwd 변수와 비교
			if (map.get(id) != pwd) {
				System.out.println("비밀번호 불일치");
			} else {
				System.out.println("로그인 성공!");
			}
		}

	} // end of main
} // end of class
