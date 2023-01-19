package ex7_thread_work;

import java.util.Random;
import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {
		/*
		 1 ~ 100 사이의 난수 두 개를 더하는 문제를 출제
		 키보드에서 답을 입력하여 다섯 문제가 정답처리될 때 까지 코드가 반복
		 최종적으로 다섯문제를 모두 맞히는데 몇 초가 걸렸는지 화면에 출력하며 코드를 종료
		 ---------------------------------------------------
		 20 + 15 = 35
		 정답!!
		 100 + 66 = 11
		 오답..
		 61 + 51 = 112
		 정답!!
			.....
		53 + 28 = 81
		정답!!
		5문제를 처리하는데 24초가 걸렸습니다.
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
				System.out.println("정답!!");
			}else {
				System.out.println("오답...");
			}
			
			if(count == 5) {
				tw.setEnd(false); 
				break;
			}
			
		} // end of while
		
		
		System.out.printf("%d문제를 처리하는 %d초가 걸렸습니다.",count, tw.getTime());
		
	} // end of main
} // end of class
