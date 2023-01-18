package ex2_abstract;

abstract public class AbsEx {
	// 추상클래스 : 추상메서드를 한개 이상 가지고 있는 클래스
	// 추상클래스는 abstract 키워드를 통해 추상클래스임을 명시해줘야 한다.
	
	int value = 100;
	int num = 20;
	
	public int getNum() {
		return num;
	}
	
	// 추상 메서드는 몸체(body)가 없다.
	// abstract 키워드를 통해서 추상메서드임을 명시해줘야 한다.
	
	// 추상메서드는 몸체가 없기 때문에 '미완성의 개념'이라고 한다.
	// 미 완성된 메서드를 자식클래스가 물려받아서 완성시키는 것이 조건이 된다.
	abstract public void setValue (int n);
	
	
} // end of class
