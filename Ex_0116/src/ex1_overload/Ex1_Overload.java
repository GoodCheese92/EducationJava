package ex1_overload;

public class Ex1_Overload {
	// �޼��� �����ε�(�����ε�)
	// �����ε��� �޼����� '�ߺ�����'��� �ϸ� �ϳ��� Ŭ���� ���ο���
	// ���� �̸��� ���� �޼��尡 ������ ���ǵǴ� ���� ���Ѵ�.
	
	// **�����ε带 ���� ��Ģ**
	// 1) �޼����� ������ ������ �޶�� �Ѵ�.
	// 2) ������ ���� ���ٸ� Ÿ���� �޶�� �Ѵ�.
	// 3) ������ ���� Ÿ���� ���� ��, ���� ������ �޶�� �Ѵ�.
	
	public void result() {
		System.out.println("���ڰ� ���� �޼���");
	} // end of result()

	public void result(int n) {
		System.out.println("������ ���ڷ� �޴� �޼���");
	} // end of result(int n)
	
	public void result(char c) {
		System.out.println("���ڸ� ���ڷ� �޴� �޼���");
	} // end of result(char c)
	
	public void result(String s) {
		System.out.println("���ڿ��� ���ڷ� �޴� �޼���");
	} // end of result(String s)
	
	public void result(String s, int n) {
		System.out.println("����, ���� ������ ���ڸ� �޴� �޼���");
	} // end of result(String s, int n)
	
	public void result(int n, String s) {
		System.out.println("����, ���� ������ ���ڸ� �޴� �޼���");
	} // end of result(int n, String s)
	
} // end of class



































