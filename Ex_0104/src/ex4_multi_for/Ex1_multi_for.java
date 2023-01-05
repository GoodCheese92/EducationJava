package ex4_multi_for;

public class Ex1_multi_for {
	public static void main(String[] args) {
		// 다중 for문 : for문 안에 for문이 추가되어 있는 경우
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		for (int i = 1; i <= 3; i++) { // 행(row)의 개수

			for (int j = 1; j <= 5; j++) { // 열(column)의 개수
				System.out.print(j + " "); // 안쪽 for에서 출력

			} // inner

			System.out.println(); // 바깥 쪽에서 한 줄 띄움

		} // outer

		System.out.println("------------------------------------");

		// 1 2 3
		// 4 5 6
		// 7 8 9
		int a = 1;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(a + " ");
				a++;
			} // inner
			System.out.println();
		} // outer

		System.out.println("------------------------------------");

		// A B C
		// D E F
		// G H I
		char ch = 'A';
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(ch + " ");
				ch++;
			} // inner
			System.out.println();
		} // outer
		
		System.out.println("-----------------------------------");

	} // end of main
} // end of class
