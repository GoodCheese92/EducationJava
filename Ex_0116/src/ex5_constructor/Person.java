package ex5_constructor;

public class Person {
	// ������ ���� 2
	// �⺻ �����ڸ� �������� �ʰ� �����ڸ� ������� ��, ������ ������ �ʰ� ��üȭ�� �� �� �ִ�.
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	} // constructor

	public void getInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("------------------");
	} // end of getInfo()

} // end of class