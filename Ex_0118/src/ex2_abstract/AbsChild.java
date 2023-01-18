package ex2_abstract;

public class AbsChild extends AbsEx {
	// 추상클래스를 상속받은 자식 클래스는 부모가 가진
	// 추상메서드를 조건부 상속하여 반드시 가지고 있어야 한다.
	
	
	@Override
	public void setValue(int n) {
		System.out.println("강제로 오버라이딩된 메서드 써봄");
	}
	
	
	
	
} // end of class
