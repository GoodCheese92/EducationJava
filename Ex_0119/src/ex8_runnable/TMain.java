package ex8_runnable;

public class TMain {
	public static void main(String[] args) {
		T1 r = new T1();
		
		// Runnable을 구현하고 있는 자식클래스 T1은
		// 부모로 부터 start() 메서드를 가져올 수 없다.
		// 왜냐하면... Runnable클래스가 인터페이스이기 때문.
		// r.start();
		Thread tt = new Thread(r);
		tt.start();	// T1의 run() 메서드가 백그라운드에서 실행
		
		System.out.println("프로그램 종료");
		
	} // end of main
} // end of class
