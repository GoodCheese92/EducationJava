package ex5_thread;

public class T1 extends Thread {
	int num = 0;
	
	public T1(int num) {
		this.num = num;
	}
	
	
	
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = num; i > 0; i--) {
			System.out.println(i);
		}		
	} // end of run()
	

} // end of class
