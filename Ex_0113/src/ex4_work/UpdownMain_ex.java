package ex4_work;

import java.util.Scanner;

public class UpdownMain_ex {
	public static void main(String[] args) {
		// 강사님 코드
		// 입력받은 값이 UP, DOWN, 정답인지를 판단
		
		Scanner sc = new Scanner(System.in);
		Updwon_ex ud = new Updwon_ex();
		
		while(true) {
			// up, down 및 정답처리
			// 정답인 경우 while문을 빠져나간다.
			System.out.print("숫자 : ");
			int n = sc.nextInt();
			boolean res = ud.checkReusult(n);
			
			if(res) { // res == true(if 문에서 boolean 변수는 그냥 사용해도 된다) 
				// 정답을 맞힌 경우
				break;	// while문을 빠져나간다.
			}
			
			
		} // while
		
		
	} // end of main
} // end of class
