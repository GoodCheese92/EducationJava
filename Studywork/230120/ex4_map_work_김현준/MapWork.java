package ex4_map_work;

import java.util.HashMap;
import java.util.Scanner;

public class MapWork {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("kim",1111);
		map.put("park",2222);
		map.put("lee",3333);
		
		// id : kim
		// pw : 3333
		// 비밀번호 불일치
		
		// id : lim
		// pw : 1234
		// 아이디가 존재하지 않습니다.
		
		// id : park
		// pw : 2222
		// 로그인 성공!
		
		System.out.print("id : ");
		String id = new Scanner(System.in).next();
		System.out.print("pw : ");
		int pw = new Scanner(System.in).nextInt();
		if(map.containsKey(id)) {
			if(map.get(id) == pw) {
				System.out.println("로그인 성공!");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		} else {
			System.out.println("아이디가 존재 하지 않습니다.");
		}
	}
}
