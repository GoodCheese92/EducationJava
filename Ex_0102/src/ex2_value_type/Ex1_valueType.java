package ex2_value_type;

public class Ex1_valueType {
	public static void main(String[] args) {
		// 기본 자료형(valueType)
		/* 
		 논리형 : boolean - 1bit
		 문자형 : char - 2byte
		 정수형 : byte - 1byte ....... -128 ~ 127
		 	   short - 2byte ....... -32768 ~ 32767
		 	   int - 4byte ....... -21억 ~ 21억
		 	   long - 8byte ....... -900경 ~ 900경
		 실수형 : float - 4byte
		 	   double - 8byte
		 */
		
		// 변수 : 특정 값을 저장하기 위한 공간
		// 그릇(자료형)을 구별하는 식별자
		
		// 변수 선언 규칙!
		// 1) 자료형 변수명;	(선언)
		// 2) 변수명 = 값; (대입)
		// 3) 자료형 변수명 = 값;	(초기화)
		
		// 변수 선언시 주의 사항!
		// 1) 같은 영역에서 변수이름을 중복되지 않도록 한다.
		// 2) _를 제외하고는 특수문자를 포함할 수 없다.
		// 3) 변수명은 반드시 소문자로 시작!!
		// 4) 변수명은 숫자로 시작할 수 없으며, 반드시 영문으로 작성할 것.
		
		
		
		// 1. 논리형
		// 참과 거짓. 즉, true와 false값 만을 저장하는 자료형 타입
		boolean b;
		b = true;
		b = false;
		
		// 자료형 타입에 맞는 값을 넣어줘야 한다!
		// boolean b2 = 1;
		System.out.println(b);
		
		b = true;
		System.out.println(b);
		

		// 2. 문자형
		// 홀따옴표 안에 딱 한글자만 저장 가능한 자료형
		char c = 'A';
		System.out.println("c : " + c);
		
		// char c2 = 65 + 1;
		char c2 = 'B' + 1;
		System.out.println("c2 : " + c2);
		// char 자료형에 정수가 대입되면
		// 아스키코드에서 숫자와 호환이 되는 한글자짜리 단어로 변환되어 출력됨
		
		
		// 3. 정수형
		// byte by = 128;
		
		int n1 = 2100000000;
		// int의 범위를 벗어나는 값을 long 타입에 저장하려면 반드시 L키워드를 추가해야 한다.
		long n2 = 2200000000L;	
		
		System.out.println("long값 : " + n2);
		
		
		
	}	// main
}
