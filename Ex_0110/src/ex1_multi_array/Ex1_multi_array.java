package ex1_multi_array;

public class Ex1_multi_array {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 6};
		
		// ������ �迭
		// 1���� �迭�� 2�� ���̸� 2���� �迭
		// 1���� �迭�� 3�� ���̸� 3���� �迭
		// �տ� []�� ū ���� ��ȣ(����) -> 1���� �迭�� ���� -> ���� ����
		// �ڿ� []�� ���� ���� ��ȣ(����) -> 2���� �迭�� ���� -> ���� ����
		// 3���� �̻� �迭�� ���� �� ����ġ��� �����ϸ� �� �� ������
		int[][] test = new int[2][3]; // ������ ������ �ִ� ���� �ڿ� ������ [][] �迭�̴�.
		test[0][0] = 10;
		test[0][1] = 20;
		test[0][2] = 30;

		test[1][0] = 40;
		test[1][1] = 50;
		test[1][2] = 60;

		System.out.println("test[0][1] : " + test[0][1]);

		System.out.println("-----------------------------------");

		System.out.println("������ �迭�� �ε��� ��ȣ");
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				System.out.print(i + "" + j + "\t");
			}
			System.out.println();
		}

		System.out.println("-----------------------------------");
		
		System.out.println("������ �迭�� ��");
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				System.out.print(test[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
	} // end of main
} // end of class
