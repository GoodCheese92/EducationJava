package ex5_interface;

public interface AllMenu extends Menu1, Menu2, Menu3{
	// 1. 인터페이스들 간에는 extends 키워드를 통해 서로 상속이 가능
	// 2. 인터페이스는들끼리는 다중상속이 가능
	
	// Menu1을 상속받았다면 짜장, 짬뽕 추상메서드까지 AllMenu에서 사용될 수 있게됨을 의미
	// jjajjang()
	// jjambbong()
	String rajogi();
	
} // end of interface
