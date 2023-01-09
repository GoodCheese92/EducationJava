package ex1_baseball;

import java.util.Random;
import java.util.Scanner;

public class Ex1_Baseball {
	public static void main(String[] args) {
		// 1 ~ 9�߿� ��ġ�� �ʵ��� ���� ������ ���� ��ǻ�͸� �˰��ִ´�.
		// com : 358
		// ��1 : 1 (���� �ڸ�)
		// ��2 : 2 (���� �ڸ�)
		// ��3 : 3 (���� �ڸ�)
		// �ڸ��� �ٸ��� ���ڸ� ������ -> �� ex) 123 �Է� �� 1��
		// �ڸ��� ���ڰ� �� ������ -> ��Ʈ����ũ ex) 456 �Է� �� 1��Ʈ����ũ
		// ��ġ�ϴ°� �ƹ� �͵� ������ -> �ƿ� ex) 742 �Է� �� �ƿ�

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		int com1, com2, com3;
		int u1, u2, u3;

		int count = 0;
		do {
			// �ߺ����� �ʴ� �� ���� ������ ������!
			com1 = rnd.nextInt(9) + 1; // 1 ~ 9���� ���ڸ� random���� �����.
			com2 = rnd.nextInt(9) + 1; // 1 ~ 9���� ���ڸ� random���� �����.
			com3 = rnd.nextInt(9) + 1; // 1 ~ 9���� ���ڸ� random���� �����.
		} while (com1 == com2 || com1 == com3 || com2 == com3);

		System.out.println("���� : " + com1 + com2 + com3);

		while (true) {
			count++;
			// �����̶�� �����ϴ� �� �ڸ��� ���� �Է¹޴´�.
			System.out.print("��1(���� �ڸ�) : ");
			u1 = sc.nextInt();
			System.out.print("��2(���� �ڸ�) : ");
			u2 = sc.nextInt();
			System.out.print("��3(���� �ڸ�) : ");
			u3 = sc.nextInt();
			
//			if( u1 < 1 || u1 > 9 ) {
//				continue;
//			}

			// ��Ʈ����ũ�� �� ������ ������ ����
			int strike = 0;
			int ball = 0;

			// ����ó���� ���� ����� ��
			if (u1 == com1) {
				strike++;
			} else if (u1 == com2 || u1 == com3) {
				ball++;
			}

			if (u2 == com2) {
				strike++;
			} else if (u2 == com1 || u2 == com3) {
				ball++;
			}

			if (u3 == com3) {
				strike++;
			} else if (u3 == com1 || u3 == com2) {
				ball++;
			}

			if (strike == 3) {
				System.out.println("����!"+", �õ�Ƚ�� : "+count);
				break; // ������ ���� ��� while Ż��
			} else {
				if (strike == 0 && ball == 0) {
					// out�� �Ǵ��ϴ� if��
					System.out.println("out!!");
				} else {
					// out�� �ƴ� ���
					System.out.printf("%dStrike, %dBall\n", strike, ball);
				}

			}
			
			System.out.println("--------------------------------------------");
		} // while

		System.out.println();

	} // end of main
} // end of class
