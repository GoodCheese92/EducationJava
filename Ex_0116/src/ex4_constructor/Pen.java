package ex4_constructor;

public class Pen {
	// �������� ���� 1
	// �� �ѹ��� setter ������� ������ ���� �� �ִ�.
	
	private String brand;
	private String color;
	private int price;
	
	public Pen(String color, int price) {
		this.color = color;
		this.price = price;
		brand = "monami";
	} // overload�� ������

	public Pen() {
		// System.out.println("Pen�� ������");
		brand = "monami";
		color = "black";
		price = 500;
	} // constructor

	public void result() {
		System.out.println("�귣�� : " + brand);
		System.out.println("���� : " + color);
		System.out.println("���� : " + price);
		System.out.println("--------------------");
	}

} // end of class
