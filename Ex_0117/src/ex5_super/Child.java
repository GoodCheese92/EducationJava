package ex5_super;

public class Child extends Parent {

	public Child() {
		// super : �θ�Ŭ����
		super(10); // �ڽ�Ŭ������ �����ڸ� ���� ��, �ڵ����� �����ִ�.

		super.name = "ȫ�浿"; // �θ�Ŭ������ ������ ����
		// �θ�Ŭ������ �����ڰ� �⺻ �����ڰ� �ƴ϶�� super()�޼��带 �̿��ؼ�
		// �θ�Ŭ������ �����ڸ� ��������� ȣ�����־�� �Ѵ�.
		System.out.println("Child�� ������ " + name);
	} // end of constructor

	@Override
	public void getMsg() {
		// Parent�� getMsg() �޼��带 ������ ���ÿ�
		// super.getMsg();
		System.out.println("�ڽ� Ŭ������ �޼���");
	} // end of getMsg()

} // end of class
