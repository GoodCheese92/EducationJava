package ex5_work;

import java.util.Scanner;

public class VendingMain {
	public static void main(String[] args) {
		// Ŭ�����迭 �̿�
		// Ű���忡�� �ݾ��� �Է� �ް�
		// �ش���� �ȿ��� ���� �� �ִ� ������ ��ϸ� ȭ�鿡 ���
		// ���Ḧ �����ϸ� ���� �� �ܾ��� ��ȯ

		// insert coin : 1000
		// 1000���� �Է��ϸ� 1000������ �� �� �ִ� �͸� ����Ѵ�.
		// fanta - 1000
		// coke - 900
		// sider - 900
		// >> coke
		// coke ��(��) �����ϼ̽��ϴ�.
		// �ܾ� : 100��

		Scanner sc = new Scanner(System.in);

		// Vending class ����
		Vending vd = new Vending();

		// ��ü�� �Ӽ� �Է�
		String[][] can = { { "�������� ȯŸ", "3000" }, { "���ξ��ø� ȯŸ", "3200" }, { "����� ȯŸ", "2800" }, { "�����ݶ�", "3500" },
				{ "�ݶ�", "3200" }, { "���̴�", "2600" }, { "���λ��̴�", "2700" }, { "�̶���", "1600" }, { "�������帵ũ", "5000" },
				{ "����", "1000" } };

		// vending Ŭ������ setCan ����
		vd.setCan(can);

		// ��ü ����� ���
		vd.show();
		System.out.println("--------------------");

		// ���� �Է�
		System.out.print("Insert coin : ");
		int coin = sc.nextInt();
		System.out.println("--------------------");

		// �Է��� �ݾ����� �� �� �ִ� ��� ���
		vd.show(coin);
		System.out.println("--------------------");

		// ����� ����
		do {
		System.out.print("������ ������� �Է��� �ּ��� >> ");
		String select = sc.next();

		int balance = vd.select(select, coin);
		
		System.out.println("�ܾ� : " + balance + "��");
		
		if(coin != balance) {
			break;
		}
		}while(true);
	} // end of main
} // end of class
