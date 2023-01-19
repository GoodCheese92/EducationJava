package ex7_thread_work;

import java.util.Random;
import java.util.Scanner;

public class PlusQuestion extends Thread {

	private int totalTime = 0; // 걸린시간을 저장하는 변수
	private boolean exit = true;
	private Random rnd = new Random(); // 두 개의 0 ~ 100사이의 정수를 생성할 난수 클래스
	private Scanner sc = new Scanner(System.in);
	
	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}

	public void setExit(boolean exit) {
		this.exit = exit;
	}

	@Override
	public void run() { // 시간 세는 스레드 메서드
		int second = 0;
		try {
			while(exit) { // exit가 false가 될때까지 즉, 내가 문제를 다 맞출때까지 무한반복하면서 sec를 늘림
				Thread.sleep(1000); 
				second++;
			}
		} catch (Exception e) {
			
		}
		setTotalTime(second); // 반복이 끝나면 값을 세팅하고 출력
		System.out.printf("정답을 맞추는데 %d초가 걸렸습니다.", totalTime);
	}

	public int[] randomNumbers() { // 두 개의 0 ~ 100사이의 난수를 생성해 리턴
		int ran1 = rnd.nextInt(101);
		int ran2 = rnd.nextInt(101);
		return new int[] {ran1, ran2};	
	}

	public int questionCount(int[] ranNumbers, int count) { // 내가 정답을 맞추면 count + 1 리턴 아니면 count리턴
		int answer = ranNumbers[0] + ranNumbers[1];
		int reply = -1;
		while(true) { // 혹시 숫자외 다른 타입을 입력했으면 기회를 한번 더줌.
			try {
				System.out.printf("%d + %d = ", ranNumbers[0], ranNumbers[1]);
				reply = new Scanner(System.in).nextInt();
				break;
			} catch (Exception e) {
				System.out.println("숫자를 다시 입력해주세요.");
			}
		}
		if(answer == reply) { // 정답이라면 count++
			System.out.println("정답!");
			count++;
		} else { // 아니라면 count 그대로
			System.out.println("오답..");
		}
		
		return count;
	}
	
	public void howTime (int answerCount) { // 정답 맞출 갯수
		int count = 0; // 현재 맞춘 정답 갯수
		while(answerCount > count) { // 내가 설정한 정답 갯수에 도달할때 까지 돈다
			count = questionCount(randomNumbers(),count); // 랜덤 두수를 배열로 넘겨 count값 대임
		}
		setExit(false); // 정답을 맞췄으면 exit준비
	}

}
