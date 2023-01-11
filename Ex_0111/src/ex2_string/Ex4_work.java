package ex2_string;

import java.util.Scanner;

public class Ex4_work {
	public static void main(String[] args) {
		String[][] actor = { { "[song]", "박쥐", "괴물", "관상" }, { "[lee]", "백두산", "내부자들", "광해" },
				{ "[ryo]", "올빼비", "럭키", "타짜" } };

		// 검색할 배우 : song
		// [song]
		// 박쥐
		// 괴물
		// 관상
		// --------------------검색이 올바르게 된 경우

		// 검색할 배우 : park
		// 해당 배우는 없습니다.

		Scanner sc = new Scanner(System.in);

		System.out.print("검색할 배우 이름 : ");
		String name = sc.next();
		
		
		
		for (int i = 0; i < actor.length; i++) {
			int x = actor[i][0].indexOf('[');	// '['의 인덱스 번호
			int y = actor[i][0].indexOf(']');	// ']'의 인덱스 번호
			actor[i][0] = actor[i][0].substring(x + 1, y);	// '['의 인덱스 번호 + 1부터 ']'의 인덱스 번호 전 까지 
			if (actor[i][0].equalsIgnoreCase(name)) {
				for (int j = 0; j < actor[i].length; j++) {
					System.out.println(actor[i][j]);
				}
				break;
			} else if (i == actor.length - 1) {
				System.out.println("해당 배우는 없습니다.");
			}
		}

	} // end of main
}
