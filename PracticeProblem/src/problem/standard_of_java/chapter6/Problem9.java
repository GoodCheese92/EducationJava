package problem.standard_of_java.chapter6;

public class Problem9 {
	// ������ ��ǻ�� ������ ����(marine)�� Ŭ������ ������ ���̴�. �� Ŭ������ ���
	// �߿� static�� �ٿ��� �ϴ� ���� � �͵��̰� �� ������ �����ΰ�?
	// (��, ��� ������ ���ݷ°� ������ ���ƾ� �Ѵ�.)
	
	int x=0, y=0;	// Marine�� ��ġ��ǥ(x, y)
	int hp = 60; 	// ���� ü��
	static int weapon = 6;	// ���ݷ�
	static int armor = 0;	// ����
	
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
	
	
	// �� : ��� ������ ���ݷ°� ������ ���ƾ� �ϱ� ������ static�� �ٿ��� ������ ���� �����ؼ�
	// ����ؾ� �Ѵ�.
	
} // end of class
