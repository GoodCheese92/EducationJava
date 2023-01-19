package ex4_multi_thread;

public class T2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("2");
		}

	} // end of run()

} // end of class
