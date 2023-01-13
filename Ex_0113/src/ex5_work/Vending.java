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
	
	// 입력한 금액으로 살 수 있는 목록 출력하기
	public void show(int coin) {
			if(money<=coin) {
			System.out.println(menu + ": " + money);
		}
	}
	
	// 구매할 음료수 번호 선택하기
	public int select(int coin) {
		System.out.println(menu + "을(를) 선택하셨습니다.");
		return coin-money;
	}
		
//	for(int i=0; i<vd.length; i++) {
//		if(vd[i].getMoney()<=coin) {
//			System.out.println(vd[i].getMenu() + " : " + vd[i].getMoney()+"원");
//		}
//	}
	
	
	
	
	
	
} // end of class
