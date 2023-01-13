package ex1_setter_getter;

public class Person {
	// setter & getter : private���� ������� �Ӽ��鿡 ������ �� �ֵ��� �ϱ� ���� ����
	private String brand = "samsung";	// ���� ���� �ٲ�� �ȵǴ� ������ ���ؼ��� getter�� ���� ����Ѵ�.
	private String name;
	private String phone;
	private int age;
	
	public String getBrand() {
		return brand;
	}
	
	// 1. get(set) ���� Ÿ���� �� ctrl + space�� ������ setter and getter�� �ڵ��ϼ� �Ǵ� ����� ���´�.
	// 2. ���콺 ��Ŭ�� �� -> source���� generate getter and setter�� ������ �ڵ� �����ȴ�.
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	
	
	
	

	
	
	
	
	// this : ���� Ŭ���� �ڽ�
	
//	public void setName(String name) { // �Ķ���͸� ����� ��, ������ ������ �־�� ���� ���� �� �� �ְ� �ϱ� ���� ������ ����Ͽ��� �Ѵ�.
//		this.name = name;	// ����, ������ �̸��� �Ķ���� �������� �������� ��찡 �߻� -> this. �� ����Ͽ� ��Ȯ�ϰ� ������ ����Ű�� ���� �������� ������ ��� �Ѵ�.	
//	}
	
	
//	public String getName() {
//		return name;
//	}
//	
//	public void setPhone(String p) {
//		phone = p;
//	}
//	
//	public String getPhone() {
//		return phone;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	public int getAge() {
//		return age;
//	}
	
} // end of class
