package ex3_work;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
		// Ű���忡�� ���� ���� �Է¹ް�, �Է¹��� ���ڰ� �Ҽ����� �Ǵ��Ͻÿ�.
		// ��, Ű���忡�� 1�� �޾Ҵٸ� '�Ҽ��� �ƴ�'�� ����ؾ� �Ѵ�.

		// �� : 5
		// 5��(��) �Ҽ��Դϴ�.

		// �� : 6
		// 6��(��) �Ҽ��� �ƴմϴ�.

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();

		if (num > 2) {
			for (int i = 2; i < num; i++) {
				
				if (num % i == 0) {
					System.out.println(num + "��(��) �Ҽ��� �ƴմϴ�.");
					break;
				}else if(num == (i+1)) {
					System.out.println(num + "��(��) �Ҽ��Դϴ�.");
				}
				
			}
		
		}else if(num == 2){
			System.out.println(num + "��(��) �Ҽ��Դϴ�.");
		}else {
			System.out.println("�Ҽ��� �ƴ�");
		}

	} // end of main
} // end of class
