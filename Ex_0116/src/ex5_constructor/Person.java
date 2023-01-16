package ex5_constructor;

public class Person {
	// 생성자 장점 2
	// 기본 생성자를 생성하지 않고 생성자를 만들었을 때, 정보를 빼먹지 않고 객체화를 할 수 있다.
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	} // constructor

	public void getInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("------------------");
	} // end of getInfo()

} // end of class