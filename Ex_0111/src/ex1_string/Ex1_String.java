package ex1_string;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		// String은 두 가지 특징을 가지고 있다.
		// 1) 객체 생성 방법이 두 가지다.(암시적, 명시적)
		// 2) 한 번 생성된 문자열의 내용은 변하지 않는다.(불변의 특징)
		String s1 = "abc";	// class로 만든 것은 객체명
		int a = 0;			// primitive type(기본자료형)으로 만든 것은 변수
		// String으로 만든 것은 객체 또는 변수라고 부르는 것 가능
		
		String s2 = "abc";	// abc 라는 heap 메모리 주소를 같이 사용 -> 암시적(new가 없어도 메모리 할당 가능)
		
		String s3 = new String("abc");	// new가 있다면 반드시 heap에 메모리 할당 -> 명시적 객체생성
		String s4 = new String("abc");
		
		
		// ==은 기본자료형끼리 비교하는 경우 값을 비교
		// but, 객체 간의 ==는 주소값을 비교
		System.out.println("s1 == s2");
		if(s1 == s2) {
			System.out.println("주소가 같습니다.");
		}else {
			System.out.println("주소가 다릅니다.");	
		}
		
		System.out.println("s1 == s3");
		if(s1 == s3) {
			System.out.println("주소가 같습니다.");
		}else {
			System.out.println("주소가 다릅니다.");
		}
		
		// String 클래스는 객체간 주소비교보다, 값을 비교하는 경우가 훨씬 많다.
		if(s1.equals(s3)) {
			System.out.println("값이 같습니다.");
		}else {
			System.out.println("값이 다릅니다.");
		}
		
		System.out.println("--------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
//		s3 = sc.next();
//		String s5 = "";
//		s5 = sc.next();
//		
//		if(s1 == s3) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
//		
//		if(s3 == s5) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
		
		System.out.println("--------------------------------------");
		
		String greet = "안녕";		// garbage collector가 알아서 지워줌
		greet += "하세요";
		System.out.println(greet);
		
		s1 = "bbb";		// s2의 값이 바뀌더라도 s1의 값이 변경되면 안되기 때문에 String 불변의 법칙이 무조건 필요함
		s2 = "bbb";	
		s2 = "ccc";
		System.out.println(s1);
		System.out.println(s2);
		
	} // end of main
} // end of class
