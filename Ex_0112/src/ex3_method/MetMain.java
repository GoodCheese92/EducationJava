package ex3_method;

public class MetMain {
	public static void main(String[] args) {
		Method1 m1 = new Method1();
		m1.test1();
		
		int su = 100;
		su = m1.test2(su);	// �޼��忡 �� ����(��)�� �޼��忡���� �۵�
							// su�� ���纻�� parameter�� ����. ���� �޼��尡 ������ �Ҹ�
		System.out.println("su : " + su);	// �ٸ� Ŭ������ �� ��ȯ�� �ϱ� ���ؼ��� �Ķ���Ϳ� ������ �ʿ��ϴ�.	
		m1.test2(su);
		
		String res = m1.test3("ȫ�浿", 32);
		System.out.println(res);
		
		res = m1.test3("kim", 22);
		System.out.println(res);
		
	} // end of class
} // end of class
