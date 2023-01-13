package ex8_work;

import java.util.Random;
import java.util.Scanner;

public class GraphMain {
	public static void main(String[] args) {
		// 0 ~ 9 ������ ������ 100�� ���� ����
		// ������ ������ �Ǵ� �� ���ؼ� 100���� Ȯ�� -> �׷���ȭ�� ���ؼ�
		// 0�� ���� : ###### 6
		// 1�� ���� : ######### 9
		// ...
		// 9�� ���� : ##### 4
		
		Graph graph = new Graph();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� ����(����) : ");
		int x1 = sc.nextInt();
		System.out.print("���� �� ����(��) : ");
		int x2 = sc.nextInt();
		System.out.print("���� ���� ���� : ");
		int size = sc.nextInt();
		
		graph.getGraph(x1, x2, size);
		System.out.println("--------------------------------");
		
		Graph2 g2 = new Graph2();
		
		g2.getGraph(x1, x2, size);
		
		System.out.println("----------------------------------");
		
		// ����� �ڵ�
		
		Random rnd = new Random();
		int[] nArr = new int[10];
		for(int i=0; i<100; i++) {
			int r = rnd.nextInt(10);
			System.out.print(r);
			nArr[r]++;
		}
		
		System.out.println();
		
		Graph_ex pg = new Graph_ex();
		pg.print(nArr);
		
	} // end of main
} // end of class
