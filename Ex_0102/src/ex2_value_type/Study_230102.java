package ex2_value_type;

public class Study_230102 {
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
		System.out.println(regNo);		// 주민등록 번호는 
		
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
		
		// 2-6 키워드? a, d, e
		
		// 2-7 변수 이름으로 사용 가능한 것? c, d, e, f
		
		// 2-8 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은? 	a, d
		
		// 2-9 형변환 생략 가능? 	b, d
		
		// 2-10 char 타입의 정수 값의 범위? -128 ~ 127
		
		// 2-11 변수 잘못 초기화 한 것? a, c, e?
		
		// 2-12 main 메서드? a
		
		// 2-13 타입과 기본값이 잘못? b, 
		
		
	}
}
