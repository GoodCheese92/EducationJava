package ex2_abstract;

abstract public class AbsEx {
	// �߻�Ŭ���� : �߻�޼��带 �Ѱ� �̻� ������ �ִ� Ŭ����
	// �߻�Ŭ������ abstract Ű���带 ���� �߻�Ŭ�������� �������� �Ѵ�.
	
	int value = 100;
	int num = 20;
	
	public int getNum() {
		return num;
	}
	
	// �߻� �޼���� ��ü(body)�� ����.
	// abstract Ű���带 ���ؼ� �߻�޼������� �������� �Ѵ�.
	
	// �߻�޼���� ��ü�� ���� ������ '�̿ϼ��� ����'�̶�� �Ѵ�.
	// �� �ϼ��� �޼��带 �ڽ�Ŭ������ �����޾Ƽ� �ϼ���Ű�� ���� ������ �ȴ�.
	abstract public void setValue (int n);
	
	
} // end of class
