package ex4_interface;

public class InterMain {
	public static void main(String[] args) {
		// 추상과 마찬가지로 완성이 덜 된 메서드가 포함되어 있으므로
		// 직접적인 메모리 할당은 불가
		// InterTest it = new InterTest();

		// 그러므로 인터페이스를 구현한 자식클래스가
		// 생성될 때 부모인 인터페이스와 함께 메모리 할당을 받는다.
		InterChild ic = new InterChild();
		System.out.println(ic.getVALUE());

		// 추상클래스와 인터페이스의 차이점
		// 1. 인터페이스에는 상수와 추상메서드만 가능
		//    추상클래스는 변수와 메서드도 가능
		// 2. 상속받을 때 인터페이스는 implements, 추상클래스는 extends
		// 3. 인터페이스는 다중상속이 가능하다.
		
	} // end of main
} // end of class
