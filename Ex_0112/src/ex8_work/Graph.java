package ex8_work;

import java.util.Random;

public class Graph {

	public void getGraph(int a, int n, int size) { // a, n : a~n ���� ���� �� ����, size : ���� ���� ��������� ����

		Random rnd = new Random();

		int[] num = new int[size];	// size ��ŭ �迭 ����

		// ���� �� ����
		for (int i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt(n - a + 1) + a;
		}	

		String[] str = new String[n - a + 1];
		
		int count2 = 0;
		// str �迭�� ���� �� ��ŭ ���ؼ� ���� �� ���
		for (int i = a; i <= n; i++) {
			str[i] = "";	// str�迭�� null�� ��µǴ°� ����
			int count = 0;
			for (int j = 0; j < size; j++) {
				if (i == num[j]) {
					str[i] += "#";
					count++;
					count2++;
				}
			} // inner
			System.out.println(i+"�� ���� : "+str[i]+"\t"+count+"��");
		} // outer
		System.out.println("�� ����: "+ count2);

	}

} // end of class
