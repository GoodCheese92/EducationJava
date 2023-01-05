package ex8_work;

public class Ex1_work {
	public static void main(String[] args) {
		// 1. 2중 for문을 사용하여 아래의 결과를 출력하시오.
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("----------------------------------");

		// 2. 2중 for문을 사용하여 아래의 결과를 출력하시오. (제일 마지막에 풀 것)
		//         *
		//       * * *
		//     * * * * *
		//   * * * * * * *
		// * * * * * * * * *
		int a = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print("* ");
			}
			System.out.println();
			a += 2;
		}

	} // end of main
} // end of class
