package ex3_thread;

public class ThreadEx extends Thread {
	// 쓰레드
	// 쓰레드는 하나의 프로그램에서 동시에 여러가지의 프로세스를 동시에
	// 사용할 수 있도록 해 주는 독립적인 실행단위(영역)
	
	// 쓰레드를 사용하려면 Thread 클래스를 상속받고 run() 메서드를 오버라이딩 해줘야 한다.
	@Override
	public void run() {
		// 독립적인 수행을 위한 영역
		for(int i=0; i<10; i++) {
			System.out.println("쓰레드 실행 중");
		}
	} // end of run()
	
	
	
} // end of class
