package ex5_work;

public class Vending {
	private String menu;
	private int money;
	
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	// �Է��� �ݾ����� �� �� �ִ� ��� ����ϱ�
	public void show(int coin) {
			if(money<=coin) {
			System.out.println(menu + ": " + money);
		}
	}
	
	// ������ ����� ��ȣ �����ϱ�
	public int select(int coin) {
		System.out.println(menu + "��(��) �����ϼ̽��ϴ�.");
		return coin-money;
	}
		
//	for(int i=0; i<vd.length; i++) {
//		if(vd[i].getMoney()<=coin) {
//			System.out.println(vd[i].getMenu() + " : " + vd[i].getMoney()+"��");
//		}
//	}
	
	
	
	
	
	
} // end of class
