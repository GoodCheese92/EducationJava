package ex2_overload;

public class Bread {
	// �޼��� 1
	public void makeBread() {
		System.out.println("���� ��������ϴ�.");
	} // end of makeBread()

	// �޼��� 2
	public void makeBread(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("���� ��������ϴ�.");
		}
		System.out.println(count + "���� ���� ��������ϴ�.");
	} // end of makeBread(int n)

	// �޼��� 3
	public void makeBread(String name, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(name + "��(��) ��������ϴ�.");
		}
		System.out.println(count + "���� " + name + "��(��) ��������ϴ�.");
	} // end of makeBread(String s, int n)

} // end of class
