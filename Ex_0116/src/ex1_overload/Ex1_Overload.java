package ex1_overload;

public class Ex1_Overload {
	// 메서드 오버로드(오버로딩)
	// 오버로딩은 메서드의 '중복정의'라고 하며 하나의 클래스 내부에서
	// 같은 이름을 가진 메서드가 여러개 정의되는 것을 말한다.
	
	// **오버로드를 위한 규칙**
	// 1) 메서드의 인자의 갯수가 달라야 한다.
	// 2) 인자의 수가 같다면 타입이 달라야 한다.
	// 3) 인자의 수와 타입이 같을 때, 인자 순서가 달라야 한다.
	
	public void result() {
		System.out.println("인자가 없는 메서드");
	} // end of result()

	public void result(int n) {
		System.out.println("정수를 인자로 받는 메서드");
	} // end of result(int n)
	
	public void result(char c) {
		System.out.println("문자를 인자로 받는 메서드");
	} // end of result(char c)
	
	public void result(String s) {
		System.out.println("문자열을 인자로 받는 메서드");
	} // end of result(String s)
	
	public void result(String s, int n) {
		System.out.println("문장, 정수 순으로 인자를 받는 메서드");
	} // end of result(String s, int n)
	
	public void result(int n, String s) {
		System.out.println("정수, 문장 순으로 인자를 받는 메서드");
	} // end of result(int n, String s)
	
} // end of class



































