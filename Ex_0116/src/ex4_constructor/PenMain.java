package ex4_constructor;

public class PenMain {
	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.result();
		
		Pen p2 = new Pen();
		p2.result();
		
		Pen p3 = new Pen("gold", 30000);
		p3.result();
		// �����ڷ� ��������� ���� �ʱ�ȭ�ϸ� setter �� ���� ������ �ٲ� �� ���� �ȴ�.
		// �ѹ��� ���Ǵ� setter�� ������ ��
		
	} // end of main
} // end of class
