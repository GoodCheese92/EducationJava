package ex3_override;

public class Snake extends Animal {
	String sensor = "밤에도 잘 봄";
	
	// 메서드의 오버라이드
	// '메서드의 재 정의'의 의미를 가지며 상속관계의 객체에서
	// 부모의 메서드를 가져와 자식의 사정에 맞게 내용만 재 정의 할 수 있도록
	public int getLegs() {
		return 0;
		
	} // end of getLegs()
	
	
} // end of class
