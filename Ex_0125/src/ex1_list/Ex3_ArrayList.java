package ex1_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3_ArrayList {
	public static void main(String[] args) {
		// 추가 : abc
		// [abc]

		// 추가 : aabb
		// [abc, aabb]

		// 추가 : abc
		// 중복된 아이디

		// 추가 : exit
		// 종료

		ArrayList<String> sList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		String str;
		outer: while (true) {

			System.out.print("추가 : ");
			str = sc.next();

			if (str.equalsIgnoreCase("exit")) {
				System.out.println("추가 종료!");
				break;
			}

			boolean isCheck = true;

			// 방법 1
			for (int i = 0; i < sList.size(); i++) {
				if (str.equals(sList.get(i))) {
					System.out.println("중복된 아이디");
					isCheck = false;
					break;
				}
			}

			// 방법 2
			if (sList.contains(str)) {
				System.out.println("중복된 아이디");
				continue outer;
			}

			// 방법 3
			for (int i = 0; i < sList.size(); i++) {
				if (str.equals(sList.get(i))) {
					System.out.println("중복된 아이디");
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
