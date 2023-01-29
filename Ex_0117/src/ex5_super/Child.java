package ex5_super;

public class Child extends Parent {

	public Child() {
		// super : 부모클래스
		super(10); // 자식클래스의 생성자를 만들 때, 자동으로 숨겨있다.

		super.name = "홍길동"; // 부모클래스의 변수로 접근
		// 부모클래스의 생성자가 기본 생성자가 아니라면 super()메서드를 이용해서
		// 부모클래스의 생성자를 명시적으로 호출해주어야 한다.
		System.out.println("Child의 생성자 " + name);
	} // end of constructor

	@Override
	public void getMsg() {
		// Parent의 getMsg() 메서드를 가져다 쓰시오
		// super.getMsg();
		System.out.println("자식 클래스의 메서드");
	} // end of getMsg()

} // end of class
