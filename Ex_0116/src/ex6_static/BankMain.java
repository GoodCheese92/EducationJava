package ex6_static;

public class BankMain {
	public static void main(String[] args) {
		Bank b1 = new Bank("신촌", "02-000-0000");
		Bank b2 = new Bank("연대", "02-111-1111");
		Bank b3 = new Bank("홍대", "02-222-2222");
		
		// static으로 선언되어 있지 않은 변수는 클래스로 접근 불가!
		// static으로 지정된 변수나 메서드는
		// 클래스명.static변수 형태로 바로 접근이 가능
		Bank.interest = 0.3f;
		
		
		b1.getResult();
		b2.getResult();
		b3.getResult();
		
	} // end of main
} // end of class
