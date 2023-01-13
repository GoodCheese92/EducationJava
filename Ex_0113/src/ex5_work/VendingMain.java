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

		Vending[] vd = new Vending[10];
		
		// ��ü �迭 ����
		for (int i = 0; i < vd.length; i++) {
			vd[i] = new Vending();
		}
		
		// ��ü�� �Ӽ� �Է�
		String[] name = new String[vd.length];
		int[] money = { 5000, 3000, 2500, 2000, 1500, 1000 };

		vd[0].setMenu("1. �������� ȯŸ");
		vd[1].setMenu("2. ���ξ��ø� ȯŸ");
		vd[2].setMenu("3. ����� ȯŸ");
		vd[3].setMenu("4. �����ݶ�");
		vd[4].setMenu("5. �ݶ�");
		vd[5].setMenu("6. ���̴�");
		vd[6].setMenu("7. ���λ��̴�");
		vd[7].setMenu("8. �̶���");
		vd[8].setMenu("9. �������帵ũ");
		vd[9].setMenu("10. ����");

		for (int i = 0; i < vd.length; i++) {

			if (vd[i].getMenu().contains("ȯŸ")) {
				vd[i].setMoney(money[4]);
			} else if (vd[i].getMenu().contains("�ݶ�")) {
				vd[i].setMoney(money[1]);
			} else if (vd[i].getMenu().contains("���̴�")) {
				vd[i].setMoney(money[2]);
			} else if (vd[i].getMenu().contains("�̶���")) {
				vd[i].setMoney(money[3]);
			} else if (vd[i].getMenu().contains("�������帵ũ")) {
				vd[i].setMoney(money[0]);
			} else if (vd[i].getMenu().contains("����")) {
				vd[i].setMoney(money[5]);
			}
		}
		// �� ��ü�� �Ӽ� �Է� �Ϸ�
		
		System.out.print("Insert coin : ");
		int coin = sc.nextInt();
		
		// �Է��� �ݾ����� �� �� �ִ� ��� ���
		for(int i=0; i<vd.length; i++) {
			vd[i].show(coin);
		}
		
		// ����� ����
		System.out.print("������ ����� ��ȣ�� �Է��� �ּ��� >> ");
		int select = sc.nextInt();
		
		int balance = vd[select-1].select(coin);
		System.out.println("�ܾ� : "+balance+"��");
			
			
			
	} // end of main
} // end of class
