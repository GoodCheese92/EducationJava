package ex4_multi_thread;

public class TMain {
	public static void main(String[] args) {
		T1 t1 = new T1();
		T2 t2 = new T2();
		
		t1.start();	// 1�� ����ϴ� run() �޼��带 ���������� ����
		t2.start(); // 2�� ����ϴ� run() �޼��带 ���������� ����
		
		try {
			Thread.sleep(500); // 0.5�ʰ� ���
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		
		System.out.println("main ������ ��");
		
		
		
	} // end of main
} // end of class
