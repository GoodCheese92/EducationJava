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
			for (int j = a; j < a + 10; j++) {
				if (j <= 10) {
					System.out.print(j + " ");
				} else {
					System.out.print((j % 10) + " ");
				}
			} // inner
			System.out.println();
			a++;
		} // outer

		System.out.println("------------------------------------");

		// ����� �ڵ�
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < 10; j++) {
				int num = i + j;
				if (num > 10) {
					num -= 10;
				}
				System.out.print(num + " ");
			} // inner
			System.out.println();
		} // outer

		System.out.println("------------------------------");
		
		// 1���� n������ �� ���� ����Ͻÿ�.
		// ��� : 15
		int n = 10;
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("sum : " + sum);			
		
	} // end of main
} // end of class
