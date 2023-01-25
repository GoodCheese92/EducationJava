package ex2_list;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		// 이름 : aaa
		// 나이 : 20
		// aaa / 20
		// ------------------
		// 이름 : bbb
		// 나이 : 30
		// aaa / 20
		// bbb / 30
		// ------------------
		// 이름 : aaa
		// 이름이 중복됩니다.
		// ---------------------------
		// 이름 :

		Scanner sc = new Scanner(System.in);

		ArrayList<User> list = new ArrayList<User>();

		outer: while (true) {
			// User 객체화를 while문 안으로 들어온게 포인트
			// while문이 돌 때마다 new를 통해 매번 객체화 되기 때문에 각각 담고 있는 정보가 달라진다.
			User u = new User();

			System.out.print("이름 : ");
			String name = sc.next();

			// 이름 중복체크
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getName().equals(name)) {
					System.out.println("이름이 중복됩니다.");
					System.out.println("--------------------------------");
					continue outer;
				}
			} // for

			System.out.print("나이 : ");
			int age = sc.nextInt();

			u.setName(name);
			u.setAge(age);
			// u 객체의 주소를 참조하면서 0번 방에 추가됨
			// ArrayList가 주소만 참조하기 때문에 다른 자료형의 데이터를 한번에 넣을 수 있다.
			list.add(u);

			// 결과 출력
			for (int i = 0; i < list.size(); i++) {
				System.out.printf("%s / %d\n", list.get(i).getName(), list.get(i).getAge());
			}

			System.out.println("--------------------------------");

		} // while

	} // end of main
} // end of class
