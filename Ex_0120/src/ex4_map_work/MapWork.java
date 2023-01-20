package ex4_map_work;

import java.util.HashMap;
import java.util.Scanner;

public class MapWork {
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
		System.out.print("pw : ");
		String pw = sc.next();

		if (map.containsKey(id)) {

			try {
				
				if (Integer.parseInt(pw) == map.get(id)) {
					System.out.println("로그인 성공!");
				} else {
					System.out.println("비밀번호 불일치");
				}
				
			} catch (Exception e) {
				System.out.println("비밀번호 불일치");
			} // try-catch

		} else {
			System.out.println("아이디가 존재하지 않습니다.");
		} // if

	} // end of main
} // end of class
