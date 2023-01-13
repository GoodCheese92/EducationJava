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
			System.out.println(can[i].getName() + " : "+can[i].getPrice()+"원");
		}
	}
	
	// 입력한 금액으로 살 수 있는 목록 출력하기
	public void show(int coin) {
		for(int i=0; i<can.length; i++) {
			if(can[i].getPrice()<=coin) {
				System.out.println(can[i].getName() + ": " + can[i].getPrice());
			}			
		}
	}
	
	// 구매할 음료수 선택하기
	public int select(String select, int coin) {
		int temp = 0;
		boolean isTrue = false;
		for(int i=0; i<can.length; i++) {
			if(select.equalsIgnoreCase(can[i].getName())) {
				System.out.println(can[i].getName() + "을(를) 선택하셨습니다.");
				temp =  can[i].getPrice();
				isTrue = true;
				break;
			}
		}
		if(!isTrue) {
			System.out.println("잘못입력하였습니다.");
			temp = coin;
		}
			
		return temp;
	}
		
//	for(int i=0; i<vd.length; i++) {
//		if(vd[i].getMoney()<=coin) {
//			System.out.println(vd[i].getMenu() + " : " + vd[i].getMoney()+"원");
//		}
//	}
	
	
	
	
	
	
} // end of class
