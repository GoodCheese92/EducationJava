package ex4_method;

public class Ex1_paramMain {
	public static void main(String[] args) {
		Ex1_param e1 = new Ex1_param();

		String str = "�ȳ�";
		e1.test1(str);

		System.out.println("main : " + str);

		System.out.println("-------------------------------");

		int[] arr = { 1, 2, 3 };
		e1.test2(arr);		// String�� ������ ��ü(�迭 ����)�� �Ķ���ͷ� �Ѱ��ָ� �ּҸ� �Ѱ��ش�.
		// ���� �޼��忡�� �Ķ���͸� �ް� ���� �ٲٸ� ��ü�� ���� �ٲ۴�.

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		
		
	} // end of main
} // end of class
