package ex2_value_type;

public class Study_230102 {
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
		System.out.println(regNo);		// �ֹε�� ��ȣ�� 
		
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
		
		// 2-6 Ű����? a, d, e
		
		// 2-7 ���� �̸����� ��� ������ ��? c, d, e, f
		
		// 2-8 ������ ����(reference type)�� ���� ũ���� �⺻��(primitive type)��? 	a, d
		
		// 2-9 ����ȯ ���� ����? 	b, d
		
		// 2-10 char Ÿ���� ���� ���� ����? -128 ~ 127
		
		// 2-11 ���� �߸� �ʱ�ȭ �� ��? a, c, e?
		
		// 2-12 main �޼���? a
		
		// 2-13 Ÿ�԰� �⺻���� �߸�? b, 
		
		
	}
}
