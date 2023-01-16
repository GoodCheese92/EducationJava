package ex7_work;

public class Vending {
	// 자판기 클래스를 생성자를 이용하여 수정하시오(코드 절약 가능)
	
	private Can[] can = new Can[5];
	
	String[][] Info = {{"오렌지맛", "1000"}, {"레몬맛", "1100"},
			{"사과맛", "1200"},{"포도맛", "1300"},{"우유맛", "1400"}};
	
	public Vending() {
		for(int i=0; i<can.length; i++) {
		can[i] = new Can(Info[i][0], Integer.parseInt(Info[i][1]));
		}		
	}
	
	// 구입 가능한 음료수 출력
	public void showCan(int money) {
		for(int i=0; i<can.length; i++) {
			if(money >= can[i].getPrice()) {
				System.out.printf("%s - %d\n",can[i].getName(), can[i].getPrice());
			}			
		}
	} // end of showCan()
	
	// 구입할 음료 선택하기
	public int selectCan(String name, int money) {
		for(int i=0; i<can.length; i++) {
			if(can[i].getName().equalsIgnoreCase(name)) {
				System.out.printf("%s을(를) 구입하였습니다.\n", name);
				money -= can[i].getPrice();
			}
		}
		return money;		
	} // end of selectCan()
	
	
} // end of class
