package ex1_if;

public class Ex2_if_else {
	public static void main(String[] args) {
		// if-else��
		// if(���ǽ�) {
		//	  ���ǽ��� ���� �� ����Ǵ� ����
		// } else {
		//   ���ǽ��� ������ �� ����Ǵ� ����
		// }
		
		int n = 49;
		String str = "";
		
		if(n++ >= 50) {
			str = "n�� 50 �̻��� ��";			
		}else {
			str = "n�� 50 �̸��� ��";
		}
		
		System.out.println(str);
		System.out.println("----------------------------------------");
		
		char ch = '��';
		
		if(ch == '��') {
			str = "����� �����Դϴ�.";
		} else {
			str = "����� �����Դϴ�.";
		}
		
		System.out.println(str);
		System.out.println("---------------------------------------");
		
		// �ٷ� ���� �ڵ带 ���׿����ڷ� �����Ͻÿ�
		String str1 = (ch == '��') ? (str1 = "����� �����Դϴ�.") : (str1 = "����� �����Դϴ�.");
		System.out.println(str1);
		// ���׿����� : ���ǽ� ? ������ : ���ǰ���;
		
		
		
		/*
		 C���
		 #include <stdio.h>
		 
		 main(){
		 	int a = 2;
		 	int b = 3;
		 	printf("%d + %d", a, b);
		 }
		 */
		
		
		/*
		 1. �ְ����� : . , ()
		 2. ���������� : ++, --
		 3. ��������� : *, /, +, -, %
		 4. ����Ʈ������ : >>, <<
		 5. �񱳿����� : <, >, <=, >=, ==, !=
		 6. ��Ʈ������ : &, |, ^
		 7. �������� : &&, ||, !
		 8. ���׿����� : ? :
		 9. ���Կ����� : =, *=, /=, +=, -=, %=
		 */
			
		
		
	} // main
} // end class
