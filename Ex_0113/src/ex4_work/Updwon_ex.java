package ex4_work;

import java.util.Random;

public class Updwon_ex {
	// 강사님 코드
	
	// Random rnd = new Random();
	// int random = rnd.nextInt(50) + 1;
	private int random = new Random().nextInt(50) + 1;	// 간략화 가능
	private int count = 0;
	private boolean isEnd = false;
	
	// Up, Down, 정답을 판단
	public boolean checkReusult(int n) {
		count++;
		if(n < random) {
			System.out.println("UP!");
		}else if(n > random) {
			System.out.println("DOWN!");
		}else {
			System.out.println(count + "회 만에 정답!!");
			isEnd = true;
		}
		
		return isEnd;
	}
	
	
	
	
} // end of class
