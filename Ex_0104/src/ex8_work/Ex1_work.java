package ex8_work;

public class Ex1_work {
	public static void main(String[] args) {
		// 1. 2�� for���� ����Ͽ� �Ʒ��� ����� ����Ͻÿ�.
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

		// 2. 2�� for���� ����Ͽ� �Ʒ��� ����� ����Ͻÿ�. (���� �������� Ǯ ��)
		//         *
		//       * * *
		//     * * * * *
		//   * * * * * * *
		// * * * * * * * * *
		
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < (5 - i) * 2; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {	// 2n-1 : ���� ����
				System.out.print("* ");				
			}
			System.out.println();
		}
		
		
	} // end of main
} // end of class
