package ex4_work;

import java.util.ArrayList;
import java.util.Random;

public class WordGame extends Thread {
	String[] fruit = { "apple", "pineapple", "grape", "banana", "watermelon", "lemon", "peach", "peach" };

	Random rnd = new Random();
	ArrayList<String> list = new ArrayList<String>();

	private boolean isCheck = true;

	public boolean getisCheck() {
		return isCheck;
	}

	public void setCheck(boolean isCheck) {
		this.isCheck = isCheck;
	}

	public void remove(String remove) {
		list.remove(remove);
		if (list.size() == 0) {
			isCheck = false;
		}
	} // end of remove()

	public void print() {
		System.out.println(list);
	}

	@Override
	public void run() {
		while (isCheck) {
			list.add(fruit[rnd.nextInt(fruit.length)]);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // while

	} // end of run()

} // end of class
