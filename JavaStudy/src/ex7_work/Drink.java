package ex7_work;

public class Drink {
	private String name; // 음료수 이름
	private int price; // 음료수 가격
	private boolean buy = false; // 해당 음료수를 살수 있는지 여부 판단

	public boolean getBuy() {
		return buy;
	}

	public void setBuy(boolean buy) {
		this.buy = buy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
