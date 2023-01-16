package ex5_work;

public class Vending_ex {
	// ����� �ڵ�
	private Can_ex[] can = new Can_ex[5];
	private int money;

	// ���Ǳ⿡ ������� ����(�ʱ�ȭ)�ϴ� �޼���
	public void canInit() {
		for (int i = 0; i < can.length; i++) {
			// �迭�� �� index�� �޸� �Ҵ�
			can[i] = new Can_ex();
		}

		can[0].setCanName("fanta");
		can[0].setPrice(1000);

		can[1].setCanName("latte");
		can[1].setPrice(1100);

		can[2].setCanName("orange");
		can[2].setPrice(1200);

		can[3].setCanName("coke");
		can[3].setPrice(1300);

		can[4].setCanName("banana");
		can[4].setPrice(1400);

	} // end of canInit()

	// ����ڰ� �Է��� ������ �ݾ� �ȿ��� ���� �� �մ� ���Ḹ ���
	public void showCans(int money) {
		this.money = money;
		for (int i = 0; i < can.length; i++) {
			if (can[i].getPrice() <= money) {
				System.out.printf("%s - %d��\n", can[i].getCanName(), can[i].getPrice());
			}
		}
	} // end of showCans

	// ����ڰ� ������ ���Ḧ �����ϰ� �ܾ��� ��ȯ
	public int outCan(String name) {
		for (int i = 0; i < can.length; i++) {
			if (can[i].getCanName().equalsIgnoreCase(name)) {
				System.out.printf("%s��(��) ���� ��\n", name);
				System.out.printf("�ܾ� : %d��\n", money -= can[i].getPrice());
			}
		} // for

		return money;
	} // end of outCan()

} // end of class
