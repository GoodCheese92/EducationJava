package ex2_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		// 상속 관계에서의 자식 클래스는 부모가 가진 자원(속성, 메서드)을
		// 마음대로 가져다가 사용할 수 있다.
		
		Child c1 = new Child();
		System.out.println(c1.money);

		// 부모 자식 관계의 클래스라고 해도 private으로 지정된 변수를
		// 자식은 가져다 쓰지 못한다.
		// System.out.println(c1.str);
		System.out.println(c1.car);
		
		// 자식클래스가 객체화 될 때 먼저 부모클래스가 생성되고 그 다음 자식 클래스가 메모리 할당을 받는다.
		
		Parent p1 = new Parent();
		// 부모 클래스는 자식 클래스에 접근할 수 없다.
		// p1.car
		
		
		// 인스턴스가 같으면 부모, 자식 클래스 관계이다.
		if(c1 instanceof Parent) {
			System.out.println("c1은 Parent와 인스턴스가 같습니다.");
		}
		
		// 상속 관계라고 할지라도 부모클래스는 자식이 가지고 있는 속성을 사용하지 못한다.
		
		// Object는 모든 클래스의 부모클래스이기 때문에 전부 사용 가능
		Object bb = 100;
		Object cc = "str";
		Object dd = p1;
		
		
	} // end of main
} // end of class






















