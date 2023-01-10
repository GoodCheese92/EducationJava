package ex3_work;

import java.util.Random;

public class Ex2_lotto_ex {
	public static void main(String[] args) {
		// ���������� lotto �迭�� ��� ������ ����Ͻÿ�

		// 15 2 41 17 6 9

		Random rnd = new Random();
		int[] lotto = new int[6];

		outer: for (int i = 0; i < lotto.length;) {
			lotto[i] = rnd.nextInt(45) + 1;

			// �ߺ� ���� üũ�ϴ� �ݺ���
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					continue outer;		// ������ �����ϸ� �ٱ��� for���� ���ǽ����� �ǳ� ��
				}

			} // inner

			System.out.print(lotto[i] + " ");	
			i++;	// �������� for�� ������ �����鼭 ���� ������ �������� �ʴٸ� i�� ������Ű�� �ʴ´�.

		} // outer

	} // end of main
} // end of class
