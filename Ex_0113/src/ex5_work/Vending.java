package ex5_work;

public class Vending {
	
	private Can[] can;
	
	public Can[] getCan() {
		return can;
	}
	
	public void setCan(String[][] can) {
		this.can = new Can[can.length];
		for(int i=0; i<can.length;i++) {
			this.can[i] = new Can();
			this.can[i].setName(can[i][0]);
			this.can[i].setPrice(Integer.parseInt(can[i][1]));
		}
	}
	
	public void show() {
		for(int i=0; i<can.length; i++) {
			System.out.println(can[i].getName() + " : "+can[i].getPrice()+"��");
		}
	}
	
	// �Է��� �ݾ����� �� �� �ִ� ��� ����ϱ�
	public void show(int coin) {
		for(int i=0; i<can.length; i++) {
			if(can[i].getPrice()<=coin) {
				System.out.println(can[i].getName() + ": " + can[i].getPrice());
			}			
		}
	}
	
	// ������ ����� �����ϱ�
	public int select(String select, int coin) {
		int temp = 0;
		boolean isTrue = false;
		for(int i=0; i<can.length; i++) {
			if(select.equalsIgnoreCase(can[i].getName())) {
				System.out.println(can[i].getName() + "��(��) �����ϼ̽��ϴ�.");
				temp =  can[i].getPrice();
				isTrue = true;
				break;
			}
		}
		if(!isTrue) {
			System.out.println("�߸��Է��Ͽ����ϴ�.");
			temp = coin;
		}
			
		return temp;
	}
		
//	for(int i=0; i<vd.length; i++) {
//		if(vd[i].getMoney()<=coin) {
//			System.out.println(vd[i].getMenu() + " : " + vd[i].getMoney()+"��");
//		}
//	}
	
	
	
	
	
	
} // end of class
