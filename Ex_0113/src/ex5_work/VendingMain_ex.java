package ex5_work;

import java.util.Scanner;

public class VendingMain_ex {
	public static void main(String[] args) {
		// ����� �ڵ�

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
		Vending_ex ven = new Vending_ex();
		ven.canInit();

		System.out.print("Insert Coin : ");
		int money = sc.nextInt();

		ven.showCans(money); // ���� �� �ִ� ������� ���

		System.out.print(">> ");
		String select = sc.next(); // ����� �̸� �Է�

		// ���� ���� �� �ܵ� ��ȯ
		ven.outCan(select);

	} // end of main
} // end of class
