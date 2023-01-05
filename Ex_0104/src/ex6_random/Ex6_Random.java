package ex6_random;

import java.util.Random;

public class Ex6_Random {
	public static void main(String[] args) {
		// 난수를 만들어주는 클래스 Random
		Random rnd = new Random();

		// 1~3 사이의 난수
		// rnd.nextInt(난수의 범위-범위 안의 숫자 개수) + 시작 수
		int num = rnd.nextInt(3) + 1;
		System.out.println(num);

		// 2~5 사이의 난수
		int num1 = rnd.nextInt(4) + 2;
		System.out.println(num1);

		// 12345 ~ 34567 사이의 난수
		// rnd.nextInt(끝수 - 시작수 + 1) + 시작수;
		int num2 = rnd.nextInt(34567 - 12345 + 1) + 12345;
		System.out.println(num2);
		
		System.out.println("-----------------------------");
		
		// A ~ Z 사이의 알파벳이 랜덤으로 출력되도록 하세요.
		// 문자 : 'H'
		char ch = (char)(rnd.nextInt('Z'-'A' + 1)+'A');
		System.out.println(ch);
		int alpha = rnd.nextInt('Z'-'A'+1) + 'A';
		System.out.println((char)alpha);
		
		

	} // end of main
} // end of class
