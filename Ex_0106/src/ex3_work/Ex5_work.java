package ex3_work;

public class Ex5_work {
	public static void main(String[] args) {
		int num = 1;

		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= 10; j++) {
				System.out.print(num++ + "\t");

			} // inner
			System.out.println();
		} // outer

		System.out.println("-----------------------------------------");
		num = 1;

		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= 10; j++) {
				System.out.printf("%02d ", num++);

			} // inner
			System.out.println();
		} // outer

		System.out.println("------------------------------------------");

		// 퀴즈 (구구단 출력)
		// 2 * 1 = 2	3 * 1 = 3 	... 	9 * 1 = 9
		// 2 * 2 = 4	3 * 2 = 6
		// 2 * 3 = 6	3 * 3 = 9
		// ...
		// 2 * 9 = 18	...
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t", j, i, j * i);
			} // inner
			System.out.println();
		} // outer
		
	} // end of main
} // end of class
