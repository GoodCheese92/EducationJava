package ex8_work;

public class Purchase {
	private String name;
	private int price;
	
	public Purchase() {
		
	} // end of constructor
	
	public Purchase(String name, int price) {
		this.name = name;
		this.price = price;
	} // end of constructor
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
} // end of class
