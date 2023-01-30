package ex8_work;

import java.io.Serializable;
import java.util.Random;

public class Rsp implements Serializable {
	private int rock = 0;
	private int scissor = 1;
	private int paper = 2;

	private String id = "";

	int win_count = 0;
	int draw_count = 0;
	int lose_count = 0;

	public int getRock() {
		return rock;
	}

	public void setRock(int rock) {
		this.rock = rock;
	}

	public int getScissor() {
		return scissor;
	}

	public void setScissor(int scissor) {
		this.scissor = scissor;
	}

	public int getPaper() {
		return paper;
	}

	public void setPaper(int paper) {
		this.paper = paper;
	}

	public String getId() {
		return id;
	}

	public Rsp(String id) {
		this.id = id;
		System.out.printf("%d승 %d무 %d패\n", win_count, draw_count, lose_count);
	} // end of constructor

	Random rnd = new Random();
	
	public void showScore() {
		System.out.printf("%d승 %d무 %d패\n", win_count, draw_count, lose_count);
	}
	
	public void gameStart(int rsp_num) {
		int npc = rnd.nextInt(3);
		String rsp = "";
		switch(npc) {
		case 0 :
			rsp = "바위";
			break;
		case 1 :
			rsp = "가위";
			break;
		case 2 :
			rsp = "보";
			break;
		}
		System.out.println("test용 : " + rsp); // 확인용
		
		
		if (rsp_num == npc) { // 비긴다.
			System.out.println("비겼습니다.");
			draw_count++;
		} else if (rsp_num - npc == 1 || rsp_num - npc == -2) { // 진다.
			System.out.println("당신이 졌습니다.");
			lose_count++;
		} else {
			System.out.println("당신이 이겼습니다.");
			win_count++;
		}
		System.out.printf("%d승 %d무 %d패\n", win_count, draw_count, lose_count);
	}

} // end of class
