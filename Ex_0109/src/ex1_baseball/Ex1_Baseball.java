package ex1_baseball;

import java.util.Random;
import java.util.Scanner;

public class Ex1_Baseball {
	public static void main(String[] args) {
		// 1 ~ 9중에 겹치지 않도록 숫자 세개를 만들어서 컴퓨터만 알고있는다.
		// com : 358
		// 수1 : 1 (백의 자리)
		// 수2 : 2 (십의 자리)
		// 수3 : 3 (일의 자리)
		// 자리가 다르고 숫자만 같으면 -> 볼 ex) 123 입력 시 1볼
		// 자리랑 숫자가 다 같으면 -> 스트라이크 ex) 456 입력 시 1스트라이크
		// 일치하는게 아무 것도 없으면 -> 아웃 ex) 742 입력 시 아웃

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		int com1, com2, com3;
		int u1, u2, u3;

		int count = 0;
		do {
			// 중복되지 않는 세 개의 난수를 만들자!
			com1 = rnd.nextInt(9) + 1; // 1 ~ 9까지 숫자를 random으로 만든다.
			com2 = rnd.nextInt(9) + 1; // 1 ~ 9까지 숫자를 random으로 만든다.
			com3 = rnd.nextInt(9) + 1; // 1 ~ 9까지 숫자를 random으로 만든다.
		} while (com1 == com2 || com1 == com3 || com2 == com3);

		System.out.println("정답 : " + com1 + com2 + com3);

		while (true) {
			count++;
			// 정답이라고 생각하는 세 자리의 수를 입력받는다.
			System.out.print("수1(백의 자리) : ");
			u1 = sc.nextInt();
			System.out.print("수2(십의 자리) : ");
			u2 = sc.nextInt();
			System.out.print("수3(일의 자리) : ");
			u3 = sc.nextInt();
			
//			if( u1 < 1 || u1 > 9 ) {
//				continue;
//			}

			// 스트라이크와 볼 갯수를 저장할 변수
			int strike = 0;
			int ball = 0;

			// 정답처리를 위한 경우의 수
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
				System.out.println("정답!"+", 시도횟수 : "+count);
				break; // 정답을 맞힌 경우 while 탈출
			} else {
				if (strike == 0 && ball == 0) {
					// out을 판단하는 if문
					System.out.println("out!!");
				} else {
					// out이 아닌 경우
					System.out.printf("%dStrike, %dBall\n", strike, ball);
				}

			}
			
			System.out.println("--------------------------------------------");
		} // while

		System.out.println();

	} // end of main
} // end of class
