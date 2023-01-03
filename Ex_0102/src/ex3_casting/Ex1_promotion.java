package ex3_casting;

public class Ex1_promotion {
	public static void main(String[] args) {
		// Casting(형변환)
		// 서로 다른 자료형 간에 값을 주고받기 위한 문법(개념)
		
		// 1. Promotion(프로모션)
		// - 큰 자료형에 작은 자료형을 대입하는 것(자동)
		double d = 100.5;	// 8byte
		int n = 200;	// 4byte
		d = n;
		System.out.println(d);
		
		char c = 'A';	// 2byte
		int n1 = 100;	// 4byte
		n1 = c;
		System.out.println(n1);
		
		n1 = 65;
		char ch = 65;
		
		
		
		
		
	} // main
}
