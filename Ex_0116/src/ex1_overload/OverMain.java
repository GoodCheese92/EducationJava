package ex1_overload;

public class OverMain {
	public static void main(String[] args) {
		Ex1_Overload ov = new Ex1_Overload();
		ov.result();
		ov.result(10);
		ov.result('A');
		ov.result("hello");
		ov.result("hi", 100);
		ov.result(100, "hi");

		System.out.println(100);
		System.out.println("hi");

	} // end of main
} // end of class
