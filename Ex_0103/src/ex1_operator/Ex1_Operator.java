package ex1_operator;

public class Ex1_Operator {
	public static void main(String[] args) {
		/*
		 ������(Operator)
		 1. �ְ����� : . , ()
		 2. ���������� : ++, --
		 3. ��������� : +, -, *, /, %
		 4. ����Ʈ������ : >>, <<
		 5. �񱳿����� : >, <, >=, <=, ==, !=
		 6. ��Ʈ������ : &, |, ^
		 7. �������� : &&, ||, !
		 8. ����(����)������ : ?, :
		 9. ���Կ����� : =, *=, /=, %=, +=, -=
		 */
		
		
		// 3. ���������
		// ��Ģ����� ������ �����ڸ� ������ �ִ�.
		int n1 = 20;
		int n2 = 7;
		int n3 = n1 + n2;	// ���ϱ�
		int n4 = n1 - n2;	// ����
		int n5 = n1 * n2;	// ���ϱ�
		int n6 = n1 / n2;	// ������(�������� ���� ���)
		int n7 = n1 % n2;	// ������
		System.out.println("n1 : "+n1+", n2 : "+n2);
		System.out.println("n3(+) : " + n3);
		System.out.println("n4(-) : " + n4);
		System.out.println("n5(*) : " + n5);
		System.out.println("n6(/) : " + n6);
		System.out.println("n7(%) : " + n7);
		
		System.out.println("-----------------------------");
		
		
		// 9. ���Կ�����
		// Ư�� ���� ������ �����Ͽ� ����ų �� ����ϴ� ������
		int i1 = 10;
		int i2 = 3;
		i1 += i2;	// i1 = i1 + i2;
		System.out.println("+= : " + i1);
		
		i1 -= 1;	// i1 = i1 - 1;
		System.out.println("-= : " + i1);
		
		i1 %= 5;	// i1 = i1 % 5;
		System.out.println("%= : " + i1);
		
		i1 *= 6;	// i1 = i1 * 6;
		System.out.println("*= : " + i1);
		
		
		
		
		
	} // main
}
