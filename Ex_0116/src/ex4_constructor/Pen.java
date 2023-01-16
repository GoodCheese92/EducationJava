package ex4_constructor;

public class Pen {
	// 생성자의 장점 1
	// 딱 한번만 setter 사용으로 보안을 높힐 수 있다.
	
	private String brand;
	private String color;
	private int price;
	
	public Pen(String color, int price) {
		this.color = color;
		this.price = price;
		brand = "monami";
	} // overload한 생성자

	public Pen() {
		// System.out.println("Pen의 생성자");
		brand = "monami";
		color = "black";
		price = 500;
	} // constructor

	public void result() {
		System.out.println("브랜드 : " + brand);
		System.out.println("색상 : " + color);
		System.out.println("가격 : " + price);
		System.out.println("--------------------");
	}

} // end of class
