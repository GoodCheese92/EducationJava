package ex4_work;

import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {
		// 1 ~ 50 사이의 난수를 발생시킨다.
		// 메인 클래스에서 정수값을 입력 받는다.
		// 입력받은 값이 up, down, 장답인지를 판단
		// 정답일 경우 main 클래스의 while문을 빠져나가도록 처리
		
		// 숫자 : 30
		// down
		// 숫자 : 15
		// up
		// 숫자 : 25
		// 3회 만에 정답!!
		Scanner sc = new Scanner(System.in);
		
		Updown ud = new Updown();
		
		int count = 0;
		while(true) {
			// up, down 및 정답처리
			// 정답인 경우 while문을 빠져나간다.
			
			
			System.out.print("숫자 : ");
			int answer = sc.nextInt();
			
			int rnd = ud.rnd();
			
			count++;
			
			if(answer<rnd) {
				ud.up(answer);
			}else if(answer>rnd) {
				ud.down(answer);
			}else {
				ud.answer(answer);
				System.out.println(count+"회 만에 정답");
				break;
			}
			
		}
		
	} // end of main
} // end of class
