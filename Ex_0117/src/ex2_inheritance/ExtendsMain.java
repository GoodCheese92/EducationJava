package ex2_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		// ��� ���迡���� �ڽ� Ŭ������ �θ� ���� �ڿ�(�Ӽ�, �޼���)��
		// ������� �����ٰ� ����� �� �ִ�.
		
		Child c1 = new Child();
		System.out.println(c1.money);

		// �θ� �ڽ� ������ Ŭ������� �ص� private���� ������ ������
		// �ڽ��� ������ ���� ���Ѵ�.
		// System.out.println(c1.str);
		System.out.println(c1.car);
		
		// �ڽ�Ŭ������ ��üȭ �� �� ���� �θ�Ŭ������ �����ǰ� �� ���� �ڽ� Ŭ������ �޸� �Ҵ��� �޴´�.
		
		Parent p1 = new Parent();
		// �θ� Ŭ������ �ڽ� Ŭ������ ������ �� ����.
		// p1.car
		
		
		// �ν��Ͻ��� ������ �θ�, �ڽ� Ŭ���� �����̴�.
		if(c1 instanceof Parent) {
			System.out.println("c1�� Parent�� �ν��Ͻ��� �����ϴ�.");
		}
		
		// ��� ������ ������ �θ�Ŭ������ �ڽ��� ������ �ִ� �Ӽ��� ������� ���Ѵ�.
		
		// Object�� ��� Ŭ������ �θ�Ŭ�����̱� ������ ���� ��� ����
		Object bb = 100;
		Object cc = "str";
		Object dd = p1;
		
		
	} // end of main
} // end of class






















