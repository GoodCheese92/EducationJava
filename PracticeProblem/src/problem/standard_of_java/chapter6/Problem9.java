package problem.standard_of_java.chapter6;

public class Problem9 {
	// 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다. 이 클래스의 멤버
	// 중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
	// (단, 모든 병사의 공격력과 방어력은 같아야 한다.)
	
	int x=0, y=0;	// Marine의 위치좌표(x, y)
	int hp = 60; 	// 현재 체력
	static int weapon = 6;	// 공격력
	static int armor = 0;	// 방어력
	
	void weaponUp() {
		weapon++;
	} // end of weaponUp()
	
	void armorUp() {
		armor++;
	} // end of armorUp()
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	} // end of move()
	
	
	// 답 : 모든 마린의 공격력과 방어력은 같아야 하기 때문에 static을 붙여서 변수의 값을 공유해서
	// 사용해야 한다.
	
} // end of class
