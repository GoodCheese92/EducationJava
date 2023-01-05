package problem.standard_of_java.chapter2;

public class Study_230102_chapter2 {
	public static void main(String[] args) {
		// 2-1 �ڷ���
		/*
		 1) ���� : boolean - 1byte
		 2) ������ : char - 2byte
		 3) ������ : byte - 1byte, short - 2byte, int - 4byte, long - 8byte
		 4) �Ǽ��� : float - 4byte, double - 8byte
		 */
		
		// 2-2 �ֹε�Ϲ�ȣ
		int regNo1 = 920324;
		int regNo2 = 111111;
		System.out.println(regNo1 + "-" + regNo2);
		long regNo = 9203241111111L;
		System.out.println(regNo);		// �ֹε�� ��ȣ�� ���
		
		// 2-3 ���ͷ�, ����, Ű����
		int i = 100;
		long l = 100L;
		final float PI = 3.14f;
		
		// ���ͷ� : 100, 100L, 3.14f
		// ���� : i, l, PI
		// Ű���� : int, long, final, float
		// ��� : PI
		
		// 2-4 �⺻���� �ƴ� ���� ? Byte
		
		// 2-5 ��°��
		System.out.println("1" + "2");		// 12
		System.out.println(true + "");		// true
		System.out.println('A' + 'B');		// 131
		System.out.println('1' + 2);		// 51
		System.out.println('1' + '2');		// 99
		System.out.println("J" + "ava");	// Java
		//System.out.println(true + null);	// ����
		// char, byte, short ���� ��� ���� ������ �� �� int�� ���������� ��ȯ�ȴ�.
		// ���ڿ� + any type�� �Ǹ� �� ���ڿ��� ��ȯ�ȴ�.
		// but, ���������� ���� ���� ���, ������ ���� ���� ex) 1 + 1 + "1" -> 21, "1"+ 1 + 1 -> 111
		System.out.println(1+1+"1");
		System.out.println("1"+1+1);
		
		// 2-6 Ű���尡 �ƴ� ����? b, c, d, e
		// ex) Ű���� ���� - abstract, if, for, true, throws, final, null, void
		
		// 2-7 ���� �̸����� ��� ������ ��? c, d, e, f
		// (1) ��ҹ��� ����, ���� ��� ����
		// (2) ����� ��� �Ұ� - ex) true�� �Ұ�, True�� ����
		// (3) ���ڷ� �����ؼ��� �ȵȴ�.
		// (4) Ư�����ڴ� '_'�� '$'���� ����Ѵ�.
		
		
		// 2-8 ������ ����(reference type)�� ���� ũ���� �⺻��(primitive type)��? 	a, d
		// ������ ����(reference type)�� �⺻��(primitive type)�� �����ϸ� ��� �� �̴�.
		// ��� ������ ������ ũ��� 4byte�̴�.
		
		// **2-9 ����ȯ ���� ����? 	d, e
		
		// 2-10 char Ÿ���� ���� ���� ����? char�� 2byte�̹Ƿ� 16��Ʈ�̰� 2^16���� ���ڸ� ǥ�� ����
		
		// 2-11 ���� �߸� �ʱ�ȭ �� ��? a, b, c, d
		// a. byte b = 256;		// byte�� ����(-128~127)�� �Ѵ� ������ �ʱ�ȭ �� �� ����.
		// b. char c = '';		// char�� �ݵ�� �� ���� ���ڸ� �����ؾ� ��
		// c. char answer = 'no';	// char�� �� ���� ���ڸ� ������ �� ����
		// d. float f = 3.14;		// 3.14�� 3.14d�� ������ ����. ���̻� f�� ���̰ų� ����ȯ �ʿ�.
		
		double d = 1.4e4;
		System.out.println(d);
		
		// 2-12 main �޼���? a, b, c, e
		// public static void main(String[] args)
		// public static void main(String args[])
		// public static void main(String[] arv)
		// static public void main(String[] args)
		// []�� ��ġ�� Ÿ�� �Ǵ� ������ �ڿ� �ٿ��� ����, �������� �ٲ� ��� ����, static�� public�� ��ġ�� ���� ����
		
		
		// 2-13 Ÿ�԰� �⺻���� �߸�? c, e, f
		// a. boolean = false : �⺻��
		// b. char = '��u0000' : �⺻��
		// c. float = 0.0		// float�� 0.0f�� �⺻��, 0.0�� 0.0d���� ���̻� d�� ������ ��.
		// d. int = 0 : �⺻��
		// e. long = 0 		// long�� 0L�� �⺻��
		// f. String = "" 	// String�� ������ Ÿ��. ��� ������ Ÿ���� �⺻ ���� null, ũ��� 4byte
		
		
	}
}
