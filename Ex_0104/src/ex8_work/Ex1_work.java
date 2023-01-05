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
		
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < (5 - i) * 2; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {	// 2n-1 : 별의 개수
				System.out.print("* ");				
			}
			System.out.println();
		}
		
		
	} // end of main
} // end of class
