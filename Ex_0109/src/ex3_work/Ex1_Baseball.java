package ex3_work;

import java.util.Random;
import java.util.Scanner;

public class Ex1_Baseball {
	public static void main(String[] args) {
		// ������ ������ ���ھ߱� ������
		// �迭�� ����Ͽ� �ڵ带 �ٿ�������.
		int size = 4;
		int com[] = new int[size];
		Random rnd = new Random();
//		int x = 0;
		boolean isCom = false;
		
		do {
			// com[0~2]���� ��������
			for (int i = 0; i < com.length; i++) {
				
				com[i] = rnd.nextInt(9) + 1;
				
				// �ߺ� �� ��
				for(int j = 0; j<com.length; j++) {
					if(com[i] == com[j]) {
						if(i == j) {
							continue;
						}else {
							isCom = true;
							i--;;							
						}
					}else {
						isCom = false;
					}
				}
				
			}
			
		} while (isCom);

		System.out.print("com : ");
		for (int i = 0; i < com.length; i++) {
			System.out.print(com[i] + "");
		}
		System.out.println();

		Scanner sc = new Scanner(System.in);

		int strike = 0;
		int ball = 0;
		int count = 0;
		int[] u = new int[com.length];

		int a = 0;
		do {
			strike = 0;
			ball = 0;
			for(int i=0; i<com.length; i++) {
				System.out.print("��"+(i+1)+" �� �Է��ϼ���.(���ڸ�) : ");
				u[i] = sc.nextInt();							
			}
			count++;
			
			for (int i = 0; i < com.length; i++) {
				for (int j = 0; j < com.length; j++) {
					if (i == j && com[i] == u[j]) {
						strike++;
					} else if(i != j && com[i]==u[j]) {
						ball++;
					}
				}
			}
			
			System.out.println("strike : " + strike + ", ball : "+ball);

		} while (strike != size);
		
		System.out.println("����!!, �õ�Ƚ�� : "+count);

		System.out.println("----------------------------------------");
		
		
	} // end of main
} // end of class
