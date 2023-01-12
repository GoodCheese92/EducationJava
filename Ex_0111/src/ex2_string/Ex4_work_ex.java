package ex2_string;

import java.util.Scanner;

public class Ex4_work_ex {
	public static void main(String[] args) {
		String[][] actor = { { "[song]", "박쥐", "괴물", "관상" }, { "[lee]", "백두산", "내부자들", "광해" },
				{ "[ryu]", "올빼비", "럭키", "타짜" } };

		// 검색할 배우 : song
		// [song]
		// 박쥐
		// 괴물
		// 관상
		// --------------------검색이 올바르게 된 경우

		// 검색할 배우 : park
		// 해당 배우는 없습니다.

		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 배우 : ");
		String name = sc.next();
		
		int count = 0;
		
		for(int i = 0; i<actor.length; i++) {
			if(actor[i][0].equalsIgnoreCase("["+name+"]")) {	// 복잡하게 배열의 []을 지우는게 아니라 비교하는 곳에 +를 이용해서 하면 간편하다.
				for(int j = 0; j<actor[i].length; j++) {
					System.out.println(actor[i][j]);
					
				} // inner
			}else {
				count++;
				if(count == actor.length) {
					System.out.println("해당 배우의 이력이 등록되어 있지 않습니다.");					
				}
			}
			
		} // outer
		
		
	} // end of main
} // end of class
