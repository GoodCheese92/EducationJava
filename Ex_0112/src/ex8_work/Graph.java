package ex8_work;

import java.util.Random;

public class Graph {

	public void getGraph(int a, int n, int size) { // a, n : a~n 까지 랜덤 수 범위, size : 랜덤 수가 만들어지는 개수

		Random rnd = new Random();

		int[] num = new int[size];	// size 만큼 배열 생성

		// 랜덤 수 생성
		for (int i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt(n - a + 1) + a;
		}	

		String[] str = new String[n - a + 1];
		
		int count2 = 0;
		// str 배열에 같은 수 만큼 비교해서 저장 및 출력
		for (int i = a; i <= n; i++) {
			str[i] = "";	// str배열이 null로 출력되는거 방지
			int count = 0;
			for (int j = 0; j < size; j++) {
				if (i == num[j]) {
					str[i] += "#";
					count++;
					count2++;
				}
			} // inner
			System.out.println(i+"의 개수 : "+str[i]+"\t"+count+"개");
		} // outer
		System.out.println("총 갯수: "+ count2);

	}

} // end of class
