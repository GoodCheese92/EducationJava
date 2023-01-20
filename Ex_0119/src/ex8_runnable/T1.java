package ex8_runnable;

public class T1 implements Runnable {
	// runnable로 Thread를 구현할 때 장점
	// 1. 상속받고 싶은 다른 클래스가 있을 때 동시에 Thread를 구현할 수 있다.
	// 2. run() 메서드를 까먹지 않고 오버라이딩 할 수 있다.
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
		} // for
		
	} // end of run()
	
	
} // end of class
