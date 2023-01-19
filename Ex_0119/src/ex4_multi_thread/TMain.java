package ex4_multi_thread;

public class TMain {
	public static void main(String[] args) {
		T1 t1 = new T1();
		T2 t2 = new T2();
		
		t1.start();	// 1을 출력하는 run() 메서드를 독립적으로 실행
		t2.start(); // 2를 출력하는 run() 메서드를 독립적으로 실행
		
		try {
			Thread.sleep(500); // 0.5초간 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		
		System.out.println("main 쓰레드 끝");
		
		
		
	} // end of main
} // end of class
