package ex8_work;

import java.util.Random;

public class Graph2 {
	public void getGraph(int a, int n, int size) { // a, n : a~n ���� ���� �� ����, size : ���� ���� ��������� ����

		Random rnd = new Random();

		int[] num = new int[size];	// size ��ŭ �迭 ����

		// ���� �� ����
		for (int i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt(n - a + 1) + a;
		}	

		// 
		int[] num2 = new int[n-a+1];
		
		String[] str = new String[n - a + 1];
		
		for(int i=0; i<size; i++) {
			num2[num[i]]++;
		}
		
		int count2 = 0;
		
		for(int i=0; i<num2.length; i++) {
			int count = 0;
			System.out.print(i+"�� ���� : ");
			for(int j=0; j<num2[i];j++) {
				System.out.print("#");
				count++;
				count2++;
			}
			System.out.print("\t"+count+"��");
			System.out.println();
		}
		
		System.out.println("�� ����: "+ count2);

	}
	
	
} // end of class
