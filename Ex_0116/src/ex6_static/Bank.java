package ex6_static;

public class Bank {
	private String point;
	private String tel;
	
	// ��ü�� �ƹ��� ���� �����Ǿ static ������ �޸𸮿� �� �Ѱ��� ����� ����.
	static float interest;

	public Bank(String point, String tel) {
		this.point = point;
		this.tel = tel;
		interest = 10f;
	} // end of constructor

	public void getResult() {
		System.out.println("���� : " + point);
		System.out.println("��ȭ : " + tel);
		System.out.println("������ : " + interest+"%");
		System.out.println("------------------------");
	} // end of getResult()

} // end of class
