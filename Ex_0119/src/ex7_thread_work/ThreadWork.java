package ex7_thread_work;


public class ThreadWork extends Thread {
	
	private int time = 0;
	private boolean end = true;
	
	public int getTime() {
		return time;
	}
	
	public void setEnd(boolean end) {
		this.end = end;
	}
	
	@Override
	public void run() {
		try {
			while(end) {
				Thread.sleep(1000);
				time++;				
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} // end of run()
	
	
	
	
} // end of class
