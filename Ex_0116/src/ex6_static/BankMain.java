package ex6_static;

public class BankMain {
	public static void main(String[] args) {
		Bank b1 = new Bank("����", "02-000-0000");
		Bank b2 = new Bank("����", "02-111-1111");
		Bank b3 = new Bank("ȫ��", "02-222-2222");
		
		// static���� ����Ǿ� ���� ���� ������ Ŭ������ ���� �Ұ�!
		// static���� ������ ������ �޼����
		// Ŭ������.static���� ���·� �ٷ� ������ ����
		Bank.interest = 0.3f;
		
		
		b1.getResult();
		b2.getResult();
		b3.getResult();
		
	} // end of main
} // end of class
