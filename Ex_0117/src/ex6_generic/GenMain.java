package ex6_generic;

public class GenMain {
	public static void main(String[] args) {
		// 제네릭 타입이 String으로 지정된 gen1 객체 생성
		GenEx<String> gen1 = new GenEx<String>();
		gen1.setValue("hi");
		String res = gen1.getValue();
		System.out.println(res);
		
		// 제네릭 타입이 Integer 클래스로 지정된 gen2 객체 생성
		// 제너릭 타입은 클래스만을 넣어줄 수 있기 때문에
		// 기본자료형을 사용하고 싶다면 wrapper를 넣어줘야 한다.
		GenEx<Integer> gen2 = new GenEx<Integer>();
		gen2.setValue(100);
		int num = gen2.getValue();
		System.out.println(num);
		
		// 기본자료형의 wrapper 클래스
		// Integer -> int
		// Character -> char
		// Byte -> byte
		// Short -> short
		// Boolean -> boolean
		// Long -> long
		// Float -> float
		// Double -> double
		
		
		
		
	} // end of main
} // end of class
