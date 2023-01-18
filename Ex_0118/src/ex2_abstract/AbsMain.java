package ex2_abstract;

public class AbsMain {
	public static void main(String[] args) {
		// 추상클래스는 직접적으로 메모리를 할당 받는 것이 불가
		// AbsEx parent = new AbsEx();
		
		// 그러므로 추상클래스는 자식클래스가 생성될 때 함께 메모리 할당을 받는다.
		AbsChild child = new AbsChild();
		child.setValue(10);
		
		
		
		
	} // end of main
} // end of class
