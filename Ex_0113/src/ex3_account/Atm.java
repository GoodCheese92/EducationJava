package ex3_account;

public class Atm {
	private int money;

	public void setMoney(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	// 입금
	public void deposit(int money) {
		System.out.println("--- 입금 ---");
		System.out.println("입금액 : " + money + "원");
		System.out.println("입금성공");
		this.money += money;
		System.out.println("----------------------");
	}

	// 출금
	public int withdraw(int money) {
		System.out.println("--- 출금 ---");
		if(this.money - money<0) {
			System.out.println("출금 불가");
			return 0;
		}else {
			this.money -= money;
			System.out.println("출금액 : " + money + "원");
			System.out.println("출금성공");
		}

		return money;			
	}

	// 잔액보기
	public void balance() {
		System.out.println("--- 잔액 ---");
		System.out.println("잔액 : " + money + "원");
		System.out.println("----------------------");

	}

} // end of class
