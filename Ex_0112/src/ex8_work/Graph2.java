package ex8_work;

import java.util.Random;

public class Graph2 {
	public void getGraph(int a, int n, int size) { // a, n : a~n 까지 랜덤 수 범위, size : 랜덤 수가 만들어지는 개수

		Random rnd = new Random();

		int[] num = new int[size];	// size 만큼 배열 생성

		// 랜덤 수 생성
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
			System.out.print(i+"의 개수 : ");
			for(int j=0; j<num2[i];j++) {
				System.out.print("#");
				count++;
				count2++;
			}
			System.out.print("\t"+count+"개");
			System.out.println();
		}
		
		System.out.println("총 갯수: "+ count2);

	}
	
	
} // end of class
