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
		int a = 1;
		
		for (int i = 1; i <= 10; i++) {
			for (int j = a; j < a+10; j++) {
				if (j <= 10) {
					System.out.print(j + " ");
				} else {
					System.out.print((j%10) + " ");
				
				}
			} // inner
			System.out.println();
			a++;			
		} // outer

	} // end of main
} // end of class
