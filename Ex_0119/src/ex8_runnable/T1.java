package ex8_runnable;

public class T1 implements Runnable {
	// runnable�� Thread�� ������ �� ����
	// 1. ��ӹް� ���� �ٸ� Ŭ������ ���� �� ���ÿ� Thread�� ������ �� �ִ�.
	// 2. run() �޼��带 ����� �ʰ� �������̵� �� �� �ִ�.
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
		} // for
		
	} // end of run()
	
	
} // end of class
