package ex3_casting;

public class Ex1_promotion {
	public static void main(String[] args) {
		// Casting(����ȯ)
		// ���� �ٸ� �ڷ��� ���� ���� �ְ�ޱ� ���� ����(����)
		
		// 1. Promotion(���θ��)
		// - ū �ڷ����� ���� �ڷ����� �����ϴ� ��(�ڵ�)
		double d = 100.5;	// 8byte
		int n = 200;	// 4byte
		d = n;
		System.out.println(d);
		
		char c = 'A';	// 2byte
		int n1 = 100;	// 4byte
		n1 = c;
		System.out.println(n1);
		
		n1 = 65;
		char ch = 65;
		
		
		
		
		
	} // main
}
