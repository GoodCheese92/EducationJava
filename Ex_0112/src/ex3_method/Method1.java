package ex3_method;

public class Method1 {
	// �޼����� ���� �� ����

	public void test1() {
		System.out.println("�ȳ��ϼ���");
	}

	public int test2(int n) {
		// ��ȯ���� void�� �ƴ� ���, �������� �ݵ��
		// return���� ���ԵǾ� �־�� �Ѵ�.
		n += 100;
		System.out.println("n : " + n);
		
		// return ���� �ݵ�� ��ȯ�� Ÿ�԰� �����ش�.
		return n;
		// System.out.println();	// return�� ������ �޼��尡 ����Ǳ� ������ �ڿ� �ڵ��ۼ� ����
		// �ϳ��� �޼��忡�� �ϳ��� return�� ���� 
	}
	
	public String test3(String s, int n) {
		String str = "���� " + s + "�̰�, " + n + "�� �Դϴ�.";
		return str;
	}

} // end of class
