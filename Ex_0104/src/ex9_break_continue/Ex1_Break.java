package ex9_break_continue;

public class Ex1_Break {
	public static void main(String[] args) {
		// break�� : �ݺ��� ������ ���������� ���� ����� �ݺ����� �������� �� ����ϴ� Ű����
		for(int i = 1; i<= 2; i++) {
			for(int j =1; j<=10; j++) {
				if(j % 2 == 0) {
					// ���� ����� �ݺ����� Ż��
					break;
					// System.out.println("������� ���� �Ұ�");   // break �Ʒ����� � �ڵ嵵 �߰��� �� ����.
				}				
				
				System.out.printf("%d ", j);
				
			} // inner
			System.out.println();
		} // outer
		
		
	} // end of main
} // end of class
