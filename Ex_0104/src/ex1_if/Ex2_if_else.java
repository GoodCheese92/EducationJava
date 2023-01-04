package ex1_if;

public class Ex2_if_else {
	public static void main(String[] args) {
		// if-else문
		// if(조건식) {
		//	  조건식이 참일 때 실행되는 영역
		// } else {
		//   조건식이 거짓일 때 실행되는 영역
		// }
		
		int n = 49;
		String str = "";
		
		if(n++ >= 50) {
			str = "n은 50 이상의 수";			
		}else {
			str = "n은 50 미만의 수";
		}
		
		System.out.println(str);
		System.out.println("----------------------------------------");
		
		char ch = '남';
		
		if(ch == '여') {
			str = "당신은 여자입니다.";
		} else {
			str = "당신은 남자입니다.";
		}
		
		System.out.println(str);
		System.out.println("---------------------------------------");
		
		// 바로 위의 코드를 삼항연산자로 수정하시오
		String str1 = (ch == '남') ? (str1 = "당신은 남자입니다.") : (str1 = "당신은 여자입니다.");
		System.out.println(str1);
		// 삼항연산자 : 조건식 ? 조건참 : 조건거짓;
		
		
		
		/*
		 C언어
		 #include <stdio.h>
		 
		 main(){
		 	int a = 2;
		 	int b = 3;
		 	printf("%d + %d", a, b);
		 }
		 */
		
		
		/*
		 1. 최고연산자 : . , ()
		 2. 증감연산자 : ++, --
		 3. 산술연산자 : *, /, +, -, %
		 4. 시프트연산자 : >>, <<
		 5. 비교연산자 : <, >, <=, >=, ==, !=
		 6. 비트연산자 : &, |, ^
		 7. 논리연산자 : &&, ||, !
		 8. 삼항연산자 : ? :
		 9. 대입연산자 : =, *=, /=, +=, -=, %=
		 */
			
		
		
	} // main
} // end class
