package problem.standard_of_java.chapter2;

public class Study_230102_chapter2 {
	public static void main(String[] args) {
		// 2-1 자료형
		/*
		 1) 논리형 : boolean - 1byte
		 2) 문자형 : char - 2byte
		 3) 정수형 : byte - 1byte, short - 2byte, int - 4byte, long - 8byte
		 4) 실수형 : float - 4byte, double - 8byte
		 */
		
		// 2-2 주민등록번호
		int regNo1 = 920324;
		int regNo2 = 111111;
		System.out.println(regNo1 + "-" + regNo2);
		long regNo = 9203241111111L;
		System.out.println(regNo);		// 주민등록 번호는 등록
		
		// 2-3 리터럴, 변수, 키워드
		int i = 100;
		long l = 100L;
		final float PI = 3.14f;
		
		// 리터럴 : 100, 100L, 3.14f
		// 변수 : i, l, PI
		// 키워드 : int, long, final, float
		// 상수 : PI
		
		// 2-4 기본형이 아닌 것은 ? Byte
		
		// 2-5 출력결과
		System.out.println("1" + "2");		// 12
		System.out.println(true + "");		// true
		System.out.println('A' + 'B');		// 131
		System.out.println('1' + 2);		// 51
		System.out.println('1' + '2');		// 99
		System.out.println("J" + "ava");	// Java
		//System.out.println(true + null);	// 오류
		// char, byte, short 같은 경우 덧셈 연산이 될 때 int형 정수값으로 변환된다.
		// 문자열 + any type이 되면 다 문자열로 변환된다.
		// but, 덧셈연산이 먼저 나올 경우, 덧셈이 먼저 진행 ex) 1 + 1 + "1" -> 21, "1"+ 1 + 1 -> 111
		System.out.println(1+1+"1");
		System.out.println("1"+1+1);
		
		// 2-6 키워드가 아닌 것은? b, c, d, e
		// ex) 키워드 예시 - abstract, if, for, true, throws, final, null, void
		
		// 2-7 변수 이름으로 사용 가능한 것? c, d, e, f
		// (1) 대소문자 구별, 길이 상관 없음
		// (2) 예약어 사용 불가 - ex) true는 불가, True는 가능
		// (3) 숫자로 시작해서는 안된다.
		// (4) 특수문자는 '_'와 '$'만을 허용한다.
		
		
		// 2-8 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은? 	a, d
		// 참조형 변수(reference type)는 기본형(primitive type)을 제외하면 모두 다 이다.
		// 모든 참조형 변수의 크기는 4byte이다.
		
		// **2-9 형변환 생략 가능? 	d, e
		
		// 2-10 char 타입의 정수 값의 범위? char는 2byte이므로 16비트이고 2^16개의 문자를 표현 가능
		
		// 2-11 변수 잘못 초기화 한 것? a, b, c, d
		// a. byte b = 256;		// byte의 범위(-128~127)를 넘는 값으로 초기화 할 수 없음.
		// b. char c = '';		// char는 반드시 한 개의 문자를 지정해야 함
		// c. char answer = 'no';	// char는 두 개의 문자를 저장할 수 없음
		// d. float f = 3.14;		// 3.14는 3.14d의 생략된 형태. 접미사 f를 붙이거나 형변환 필요.
		
		double d = 1.4e4;
		System.out.println(d);
		
		// 2-12 main 메서드? a, b, c, e
		// public static void main(String[] args)
		// public static void main(String args[])
		// public static void main(String[] arv)
		// static public void main(String[] args)
		// []의 위치는 타입 또는 변수명 뒤에 붙여도 가능, 변수명은 바뀌어도 상관 없음, static과 public의 위치는 변경 가능
		
		
		// 2-13 타입과 기본값이 잘못? c, e, f
		// a. boolean = false : 기본값
		// b. char = '￦u0000' : 기본값
		// c. float = 0.0		// float는 0.0f가 기본값, 0.0은 0.0d에서 접미사 d가 생략된 것.
		// d. int = 0 : 기본값
		// e. long = 0 		// long은 0L이 기본값
		// f. String = "" 	// String은 참조형 타입. 모든 참조형 타입의 기본 값은 null, 크기는 4byte
		
		
	}
}
