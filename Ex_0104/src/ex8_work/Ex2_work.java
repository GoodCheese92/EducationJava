package ex8_work;

public class Ex2_work {
	public static void main(String[] args) {
		// 3. 2�� for���� ����Ͽ� �Ʒ��� ����� �����Ͻÿ�.

		// 1 2 3 4 5 6 7 8 9 10
		// 2 3 4 5 6 7 8 9 10 1
		// 3 4 5 6 7 8 9 10 1 2
		// ....................
		// 10 1 2 3 4 5 6 7 8 9

		// �� 100���� ���ڸ� ����Ͻÿ�
		
		int s = 11;
		for (int i = 1; i <= s; i++) {
			for (int j = i; j < i+s; j++) {
				if (j <= s) {
					System.out.print(j + " ");
				} else {
					System.out.print((j%s) + " ");
				
				}
			} // inner
			System.out.println();
		} // outer

	} // end of main
} // end of class
