package ex2_switch;

public class Ex3_switch {
	public static void main(String[] args) {
		// ����ġ���� �񱳰����� �� ������ Ÿ�Ը� ����� ����
		// ����(byte, int, short), ���ڿ�(String), ����(char)
		
		char ch = '��';
		
		switch(ch) {// �񱳰�
		case '��':
			System.out.println("21%");
			//break;		// break�� ���� �� ���� �񱳰�==���ǰ��� �������� �ʴ��� ����ȴ�.
		case '��':
			System.out.println("14%");
			break;
		case '��':
			System.out.println("8%");
			break;
		} //switch
		
	} // main
} // end class
