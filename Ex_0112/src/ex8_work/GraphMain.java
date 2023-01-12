package ex8_work;

import java.util.Scanner;

public class GraphMain {
	public static void main(String[] args) {
		// 0 ~ 9 사이의 난수를 100개 만들어서 저장
		// 각각의 개수를 판단 후 더해서 100인지 확인 -> 그래프화를 통해서
		// 0의 갯수 : ###### 6
		// 1의 갯수 : ######### 9
		// ...
		// 9의 갯수 : ##### 4
		
		Graph graph = new Graph();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("랜덤 수 범위(시작) : ");
		int x1 = sc.nextInt();
		System.out.print("랜덤 수 범위(끝) : ");
		int x2 = sc.nextInt();
		System.out.print("랜덤 생성 개수 : ");
		int size = sc.nextInt();
		
		graph.getGraph(x1, x2, size);
		System.out.println("--------------------------------");
		
		Graph2 g2 = new Graph2();
		
		g2.getGraph(x1, x2, size);
		
	} // end of main
} // end of class
