package ex1_operator;

public class Ex4_work {
	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		
		int res = ++a >= b || 2+7 <= b && 13-b >= 0 && (a+=b) - (a%b) > 10 ? 1 : 0;	// true
		//		    false  ||   true   &&   true    &&          true
		
		System.out.println("res : " + res);
//		System.out.println((a+=b) - (a%b));
////		System.out.println(23%12);
//		System.out.println(++a >= b);
//		System.out.println(2+7 <= b);
//		System.out.println(13-b >= 0);
//		System.out.println((a+=b) - (a%b) > 10);
//		System.out.println((a+=b));
//		System.out.println((a%b));
//		
		
		/*
		 연산자
		 1. 최고연산자 : (), .
		 2. 증감연산자 : ++, --
		 3. 산술연산자 : +, -, *, /, %
		 4. 시프트연산자 : <<, >>
		 5. 비교연산자 : <, >, <=, >=, ==, !=
		 6. 비트연산자 : &, |, ^
		 7. 논리연산자 : &&, ||, !
		 8. 삼항연산자 : ? :
		 9. 대입연산자 : =, +=, -=, *=, /=, %=		 		 
		 */
		
		
	} // main
} // class end
