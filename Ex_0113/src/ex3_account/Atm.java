package ex3_account;

public class Atm {
	private int money;

	public void setMoney(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	// �Ա�
	public void deposit(int money) {
		System.out.println("--- �Ա� ---");
		System.out.println("�Աݾ� : " + money + "��");
		System.out.println("�Աݼ���");
		this.money += money;
		System.out.println("----------------------");
	}

	// ���
	public int withdraw(int money) {
		System.out.println("--- ��� ---");
		if(this.money - money<0) {
			System.out.println("��� �Ұ�");
			return 0;
		}else {
			this.money -= money;
			System.out.println("��ݾ� : " + money + "��");
			System.out.println("��ݼ���");
		}

		return money;			
	}

	// �ܾ׺���
	public void balance() {
		System.out.println("--- �ܾ� ---");
		System.out.println("�ܾ� : " + money + "��");
		System.out.println("----------------------");

	}

} // end of class
