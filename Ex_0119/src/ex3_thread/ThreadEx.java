package ex3_thread;

public class ThreadEx extends Thread {
	// ������
	// ������� �ϳ��� ���α׷����� ���ÿ� ���������� ���μ����� ���ÿ�
	// ����� �� �ֵ��� �� �ִ� �������� �������(����)
	
	// �����带 ����Ϸ��� Thread Ŭ������ ��ӹް� run() �޼��带 �������̵� ����� �Ѵ�.
	@Override
	public void run() {
		// �������� ������ ���� ����
		for(int i=0; i<10; i++) {
			System.out.println("������ ���� ��");
		}
	} // end of run()
	
	
	
} // end of class
