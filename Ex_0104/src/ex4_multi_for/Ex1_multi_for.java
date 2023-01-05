package ex4_multi_for;

public class Ex1_multi_for {
	public static void main(String[] args) {
		// ���� for�� : for�� �ȿ� for���� �߰��Ǿ� �ִ� ���
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		for (int i = 1; i <= 3; i++) { // ��(row)�� ����

			for (int j = 1; j <= 5; j++) { // ��(column)�� ����
				System.out.print(j + " "); // ���� for���� ���

			} // inner

			System.out.println(); // �ٱ� �ʿ��� �� �� ���

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
