package ex2_class;

public class ChickenMain {
	public static void main(String[] args) {
		// 다형성 : 같은 클래스를 사용하지만 각각 다른 역할을 할 수 있는 것 
		
		Chicken c1 = new Chicken();
		c1.sauce = "후라이드";
		c1.myChicken();
		
		Chicken c2 = new Chicken();
		c2.sauce = "양념";
		c2.myChicken();
		
		Chicken c3 = new Chicken();
		
		
	} // end of main
} // end of class
