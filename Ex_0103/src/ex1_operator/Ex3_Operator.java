package ex1_operator;

public class Ex3_Operator {
	public static void main(String[] args) {
		// 2. ����������
		// 1�� ������Ű�ų� 1�� ���ҽ�Ű�� ������
		// ���������� ���������� �������� Ȯ���� ��������!
		int a = 10;
		System.out.println("a : " + ++a);
		
		int b = 10;
		System.out.println("b : " + b++);
		System.out.println(b);
		
		b++; // 11 b++ 11
		--b; // 12 --b 11
		--b; // 11 --b 10
		++b; // 10 ++b 11
		b--; // 11 b-- 11
		b--; // 10 b-- 10
		b++; // 9  b++ 9
		++b; // 10 b++ 11
		System.out.println(b--);
		
		// ���������ڴ� �ѹ��� 1���� ��� �����ϹǷ�
		// 2 �̻��� ������ �Ϸ��� ���Կ����ڸ� ����ϴ� ���� ����.
		b += 2;
		System.out.println(b);
		
		System.out.println("-----------------------");
		
		// 8. ����(����)������
		// ������ �ΰ�, �� ���ǿ� ���� ����� ���� ���� ������ ���� ����
		// �ٸ� ����� �����ִ� ������
		int aa = 10;
		int bb = 15;
		boolean res = (++aa >= bb) ? true : false;	// ? �տ� ������ true�� : ����, false�� : ������
		System.out.println(res);
		
		char res2 = ++aa < bb ? 'y' : 'n';
		System.out.println(res2);
		
		
	} // main
} // class end
