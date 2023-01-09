package ex3_work;

import java.util.Random;

public class Ex2_lotto {
	public static void main(String[] args) {
		// 1~45 ������ �ߺ����� �ʴ� ���� 6���� ����� lotto �迭�� ���
		// ���������� lotto �迭�� ��� ������ ����Ͻÿ�.

		// 15 2 41 17 6 9
		// ���Ŀ� ���ʽ� ��ȣ�� ��ȣ �ϳ��� �߰��Ǵ��� �� �۵��ϵ��� ����ÿ�.

		int[] lotto = new int[6];

		Random rnd = new Random();

		int i=0;
		do {
			lotto[i] = rnd.nextInt(45)+1;	// 1~45 ������ ���� ����
			i++;		// ���� for������ ����ϱ� ���� ���⼭ ����
			
			for (int j = 0; j < lotto.length; j++) {
				if(i-1==j) {	// �ε����� ��
					continue;	
				}else if(lotto[i-1] == lotto[j]) {	// i�� °�� �������� �� ��
					i--;							// ������ i--�� i��° ���� �ٽ� ����
					break;
				}
			}
		}while(i<lotto.length);
		
		for(int e : lotto) {
			System.out.print(e+" ");
		}

	} // end of main
} // end of class
