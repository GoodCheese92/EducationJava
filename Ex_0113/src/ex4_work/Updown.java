package ex4_work;

import java.util.Random;

public class Updown {
	Random rnd = new Random();
	
	int n = rnd.nextInt(50)+1;
	
	public int rnd() {
		return n;
	}
	
	public void up(int answer) {
		System.out.println("�Է��� ���� : "+answer);
		System.out.println("up");
	}
	
	public void down(int answer) {
		System.out.println("�Է��� ���� : "+answer);
		System.out.println("down");
	}
	
	public void answer(int answer) {
		System.out.println("�Է��� ���� : "+answer);
		System.out.println("����!!");
	}
	
	
} // end of class
