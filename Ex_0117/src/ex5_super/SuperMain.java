package ex5_super;

public class SuperMain {
	public static void main(String[] args) {
	
	// 자식클래스가 생성될 때, 부모클래스가 먼저 생성되고 자식클래스가 생성되기 때문에
	// 부모생성자도 같이 생성된다.
	Child c = new Child();
	// Parent p = new Parent();
	
	c.getMsg();
		
	} // end of main
} // end of class
