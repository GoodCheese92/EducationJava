package ex1_string;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		// String�� �� ���� Ư¡�� ������ �ִ�.
		// 1) ��ü ���� ����� �� ������.(�Ͻ���, �����)
		// 2) �� �� ������ ���ڿ��� ������ ������ �ʴ´�.(�Һ��� Ư¡)
		String s1 = "abc";	// class�� ���� ���� ��ü��
		int a = 0;			// primitive type(�⺻�ڷ���)���� ���� ���� ����
		// String���� ���� ���� ��ü �Ǵ� ������� �θ��� �� ����
		
		String s2 = "abc";	// abc ��� heap �޸� �ּҸ� ���� ��� -> �Ͻ���(new�� ��� �޸� �Ҵ� ����)
		
		String s3 = new String("abc");	// new�� �ִٸ� �ݵ�� heap�� �޸� �Ҵ� -> ����� ��ü����
		String s4 = new String("abc");
		
		
		// ==�� �⺻�ڷ������� ���ϴ� ��� ���� ��
		// but, ��ü ���� ==�� �ּҰ��� ��
		System.out.println("s1 == s2");
		if(s1 == s2) {
			System.out.println("�ּҰ� �����ϴ�.");
		}else {
			System.out.println("�ּҰ� �ٸ��ϴ�.");	
		}
		
		System.out.println("s1 == s3");
		if(s1 == s3) {
			System.out.println("�ּҰ� �����ϴ�.");
		}else {
			System.out.println("�ּҰ� �ٸ��ϴ�.");
		}
		
		// String Ŭ������ ��ü�� �ּҺ񱳺���, ���� ���ϴ� ��찡 �ξ� ����.
		if(s1.equals(s3)) {
			System.out.println("���� �����ϴ�.");
		}else {
			System.out.println("���� �ٸ��ϴ�.");
		}
		
		System.out.println("--------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
//		s3 = sc.next();
//		String s5 = "";
//		s5 = sc.next();
//		
//		if(s1 == s3) {
//			System.out.println("�����ϴ�.");
//		}else {
//			System.out.println("�ٸ��ϴ�.");
//		}
//		
//		if(s3 == s5) {
//			System.out.println("�����ϴ�.");
//		}else {
//			System.out.println("�ٸ��ϴ�.");
//		}
		
		System.out.println("--------------------------------------");
		
		String greet = "�ȳ�";		// garbage collector�� �˾Ƽ� ������
		greet += "�ϼ���";
		System.out.println(greet);
		
		s1 = "bbb";		// s2�� ���� �ٲ���� s1�� ���� ����Ǹ� �ȵǱ� ������ String �Һ��� ��Ģ�� ������ �ʿ���
		s2 = "bbb";	
		s2 = "ccc";
		System.out.println(s1);
		System.out.println(s2);
		
	} // end of main
} // end of class
