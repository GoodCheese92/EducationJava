package ex1_setter_getter;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		//p1.name = "ȫ�浿";
		p1.setName("ȫ�浿");		// void�� ����� �޼���� ������ name�� �̾���̱�, �ڷ����� �����ϱ� ����� �Ұ����ϴ�.
//		p1.phone = "010-111-1111";
//		p1.age = 30;
		
		p1.setPhone("010-111-1111");
		p1.setAge(30);
		
		// �Ժη� ������ ���� �ٲ��� �ʱ� ���ؼ� �Ǵ� ������ ���ؼ� Ŭ���� ������ private�� �����Ѵ�.
		// -> ����, ��ü ���� �� ������ �̸��� �ٲ� �� ��������.
		// setter and getter ������� ����
		System.out.println(p1.getName());
//		System.out.println(p1.phone);
//		System.out.println(p1.age);
		
		System.out.println(p1.getPhone());
		System.out.println(p1.getAge());
		
		
	} // end of main
} // end of class
