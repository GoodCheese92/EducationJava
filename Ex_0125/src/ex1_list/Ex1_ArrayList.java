package ex1_list;

import java.util.ArrayList;

public class Ex1_ArrayList {
	public static void main(String[] args) {
		// ArrayList : �ٸ� �÷��� ��ü��� ���� size�� ������ ���� �ʴ�.
		// index ������ ������ �����Ͽ� ��� ��ȸ���̳� ��ü ������ ��
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(20);
		
		// Ư�� index�� ���� ä���ִ� ���� ����
		list.add(1, 50);
		
		// set�� ���� Ư�� index�� ���� ��
		list.set(2, 200);
		
		// 1�� index�� ���� ����
		list.remove(1);
		
		// �������� �ʴ� index�� �����ϴ� ���� �Ұ���!!
		// list.add(4, 200);
		
		System.out.println(list);
		System.out.println(list.get(1));	// index�� �ֱ� ������ ������ ����ϱ� ����
		System.out.println("list�� ũ�� : " + list.size());
		
		System.out.println("-------------------------------------");
		
		// list�� ��� ������ for������ ����ϱ�.
		for(int i=0;i<list.size(); i++) {
			System.out.printf("%d ", list.get(i));
		}
		
		System.out.println();
		
		// ����Ʈ ��������
		list.clear();
		System.out.println(list);
		
		
		
	} // end of main
} // end of class
