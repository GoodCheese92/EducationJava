package ex4_constructor;

public class PenMain {
	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.result();
		
		Pen p2 = new Pen();
		p2.result();
		
		Pen p3 = new Pen("gold", 30000);
		p3.result();
		// 생성자로 멤버변수의 값을 초기화하면 setter 및 직접 변수를 바꿀 수 없게 된다.
		// 한번만 사용되는 setter의 역할을 함
		
	} // end of main
} // end of class
