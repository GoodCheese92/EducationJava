package ex1_class;

import java.util.Scanner;

public class ComMain {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		Computer c1 = new Computer(); // �𵨸� : Computer, �ø����ȣ : c1

		// c1�̶�� ��ü�� �����ϸ� c1�� ����ִ� ������ ������ heap ������ �޸� ������

		c1.getInfo();


		Computer c2 = new Computer();
		c2.getInfo();


		Computer c3 = new Computer();
		c3.ssd = 512;
//		c3.brand = "samsung";	// brand�� ���������ڰ� private�� �����Ǿ� �ֱ� ������ ��ü���� �� ���� �Ұ�(private�� class������ ��� ����) 
		c3.getInfo();


	}// end of main
} // end of class
