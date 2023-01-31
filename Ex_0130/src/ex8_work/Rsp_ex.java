package ex8_work;

import java.io.Serializable;

public class Rsp_ex implements Serializable {
	// 저장할 객체에는 정보만 있는 것이 좋다.
	// 메서드 등등은 없는 것이 좋다.
	private String id;
	private int win, lose, draw;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}

	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
		this.draw = draw;
	}

} // end of class
