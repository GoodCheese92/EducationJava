package ex4_work;

import java.util.ArrayList;
import java.util.Random;

public class WordGame_ex extends Thread {

	private ArrayList<String> arr;
	private String[] data;

	// 쓰레드 정지용 변수
	private boolean playing = true;

	// 생성자
	public WordGame_ex(ArrayList<String> arr, String[] data) {
		this.arr = arr;
		this.data = data;

	} // end of constructor

	public void setPlaying(boolean playing) {
		this.playing = playing;
	}

	@Override
	public void run() {
		// 3초 간격으로 arr에 단어 추가!
		while (playing) {
			int rnd = new Random().nextInt(data.length);

			arr.add(data[rnd]);

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} // while

	} // end of run()

} // end of class
