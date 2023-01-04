package ex2_switch;

public class Ex3_switch {
	public static void main(String[] args) {
		// 스위치문은 비교값으로 딱 세가지 타입만 사용이 가능
		// 정수(byte, int, short), 문자열(String), 문자(char)
		
		char ch = '김';
		
		switch(ch) {// 비교값
		case '김':
			System.out.println("21%");
			//break;		// break가 나올 때 까지 비교값==조건값이 만족하지 않더라도 수행된다.
		case '이':
			System.out.println("14%");
			break;
		case '박':
			System.out.println("8%");
			break;
		} //switch
		
	} // main
} // end class
