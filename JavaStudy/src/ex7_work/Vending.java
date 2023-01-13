package ex7_work;

public class Vending {
	private int money; // 현재 자판기가 가지고 있는 돈
	private Drink[] drk; // 음료수 이름과 가격을 객체화

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Drink[] getDrk() {
		return drk;
	}

	public void setDrk(String[][] drk) { // 주어진 이중배열을 내 입맛에 맞게 drk[] 클래스 선언하여 값 대입
		this.drk = new Drink[drk.length];
		for (int i = 0; i < drk.length; i++) {
			this.drk[i] = new Drink(); // drk[] 클래스 선언
			this.drk[i].setName(drk[i][0]); // 값 대입
			this.drk[i].setPrice(Integer.parseInt(drk[i][1])); // 값 대입
		}
	}

	public void showDrinks() { // 모든 음료수 목록 출력
		int count = 0;
		System.out.println("-------------------------------------------");
		for (int i = 0; i < drk.length; i++) {
			if (count < 3) {
				System.out.printf("%s(%d)\t", drk[i].getName(), drk[i].getPrice());
				count++;
			} else {
				System.out.print("\n\n");
				count = 0;
			}
		}
		System.out.print("\n-------------------------------------------\n");
	}
	
	public void showDrinks(int money) { // 내가 넣은 돈 이하의 가격을 가진 음료수 목록 출력
		this.money = money;
		int count = 0;
		System.out.println("-------------------------------------------");
		for (int i = 0; i < drk.length; i++) {
			if(count < 3) {
				if (money > drk[i].getPrice()) {
					drk[i].setBuy(true); // 해당 음료수를 구매할 수 있으므로 true로 바꿔준다.
					System.out.printf("%s(%d)\t", drk[i].getName(), drk[i].getPrice()); // 형식에 맞게 출력
				} else {
					int leng = drk[i].getName().length() + Integer.toString(drk[i].getPrice()).length() + 2;
					for(int j = 0; j < leng; j++) {
						System.out.print(" ");
					}
					System.out.print("\t");
				}
				count++;
			} else {
				System.out.print("\n\n");
				count = 0;
			}
		}
		System.out.print("\n-------------------------------------------\n");
	}

	public boolean chooseDrink(String drink) { // 내가 음료수를 골랐을때 고른 음료수와 잔액 반환(예외처리)
		boolean isTrue = false;
		for (int i = 0; i < drk.length; i++) {
			if (drk[i].getName().equals(drink) && drk[i].getBuy()) { 
				// 구매가능 목록중 내가 입력한 음료수와 같은가 ? && 구매가능이면 drk.buy == true
				money -= drk[i].getPrice(); // 잔액 계산
				System.out.printf("%s (을)를 선택하셨습니다.\n잔액 : %d", drk[i].getName(), money);
				isTrue = true; // while루프 벗어나기
				return isTrue;
			}
		}
		System.out.println("음료수를 잘못 골랐습니다. 다시 골라주세요.");
		return isTrue; // while루프 다시돔
	}
}
