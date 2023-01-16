package ex7_work;

public class Vending {
	// ���Ǳ� Ŭ������ �����ڸ� �̿��Ͽ� �����Ͻÿ�(�ڵ� ���� ����)
	
	private Can[] can = new Can[5];
	
	String[][] Info = {{"��������", "1000"}, {"�����", "1100"},
			{"�����", "1200"},{"������", "1300"},{"������", "1400"}};
	
	public Vending() {
		for(int i=0; i<can.length; i++) {
		can[i] = new Can(Info[i][0], Integer.parseInt(Info[i][1]));
		}		
	}
	
	// ���� ������ ����� ���
	public void showCan(int money) {
		for(int i=0; i<can.length; i++) {
			if(money >= can[i].getPrice()) {
				System.out.printf("%s - %d\n",can[i].getName(), can[i].getPrice());
			}			
		}
	} // end of showCan()
	
	// ������ ���� �����ϱ�
	public int selectCan(String name, int money) {
		for(int i=0; i<can.length; i++) {
			if(can[i].getName().equalsIgnoreCase(name)) {
				System.out.printf("%s��(��) �����Ͽ����ϴ�.\n", name);
				money -= can[i].getPrice();
			}
		}
		return money;		
	} // end of selectCan()
	
	
} // end of class
