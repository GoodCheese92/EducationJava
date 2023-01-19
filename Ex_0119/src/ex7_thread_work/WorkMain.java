package ex7_thread_work;

import java.util.Random;
import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {
		/*
		 1 ~ 100 ������ ���� �� ���� ���ϴ� ������ ����
		 Ű���忡�� ���� �Է��Ͽ� �ټ� ������ ����ó���� �� ���� �ڵ尡 �ݺ�
		 ���������� �ټ������� ��� �����µ� �� �ʰ� �ɷȴ��� ȭ�鿡 ����ϸ� �ڵ带 ����
		 ---------------------------------------------------
		 20 + 15 = 35
		 ����!!
		 100 + 66 = 11
		 ����..
		 61 + 51 = 112
		 ����!!
			.....
		53 + 28 = 81
		����!!
		5������ ó���ϴµ� 24�ʰ� �ɷȽ��ϴ�.
		 */
		
		ThreadWork tw = new ThreadWork();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		tw.start();
		while(true) {
			int num1 = new Random().nextInt(100)+1;
			int num2 = new Random().nextInt(100)+1;
			System.out.printf("%d + %d = ",num1, num2);
			int answer = sc.nextInt();
			if(num1+num2 == answer) {
				count++;
				System.out.println("����!!");
			}else {
				System.out.println("����...");
			}
			
			if(count == 5) {
				tw.setEnd(false); 
				break;
			}
			
		} // end of while
		
		
		System.out.printf("%d������ ó���ϴ� %d�ʰ� �ɷȽ��ϴ�.",count, tw.getTime());
		
	} // end of main
} // end of class
