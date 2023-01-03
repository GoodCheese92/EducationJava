package ex1_operator;

public class Ex2_Operator {
	public static void main(String[] args) {
		// 5. �񱳿�����
		// ���� ���ؼ� ���� ������ �Ǵ��ϴ� ������
		int n1 = 10;
		int n2 = 20;
		boolean res = n1 < n2;		// < : ���α׷��� ������ ������ �����̱� ������ �۴� ��� �ǹ��̴�.
		System.out.println("n1 < n2 : " + res);
		
		res = n1 >= n2;
		System.out.println("n1 >= n2 : " + res);
		
		res = n1 == n2;
		System.out.println("n1 == n2 : " + res);
		
		res = n1 != n2;
		System.out.println("n1 != n2 : " + res);
		
		System.out.println("----------------------------------");
		
		// 7. ��������
		// �񱳿����ڸ� ���� ������ �� �� �̻� �ʿ��� ��
		int age = 30;
		int limit = 35;
		// and(&&)������ : ���� ������ �����̸� ���� ������ �������� �ʴ´�.
		// t && t = t
		// t && f = f
		// f && t = f
		// f && f = f
		res = (limit - age) < 5 && (age += 2) >= 30;		
		System.out.println("&& : " + res);
		System.out.println(age);
		
		int i1 = 10;
		int i2 = 20;
		// or(||)������ : ���� ������ ���̸� ���� ������ �������� �ʴ´�.
		// t || t = t
		// t || f = t
		// f || t = t
		// f || f = f
		res = (i1 += 10) > 20 || i2 - 10 == 11;
		System.out.println("|| : " + res);
		
		// not(!)������ : ���� �������� ������ ������ �ٲ��ִ� ������
		System.out.println("! : " + res);
		System.out.println("! : " + !res);
		System.out.println(res);
		
	} // main
}
