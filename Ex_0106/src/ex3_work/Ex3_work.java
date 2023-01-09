package ex3_work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) throws NumberFormatException, IOException {
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
				} else if (num == (i + 1)) {
					System.out.println(num + "��(��) �Ҽ��Դϴ�.");
				}

			}

		} else if (num == 2) {
			System.out.println(num + "��(��) �Ҽ��Դϴ�.");
		} else {
			System.out.println("�Ҽ��� �ƴ�");
		}

		System.out.println("-------------------------");

		// ����� �ڵ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		System.out.print("������ �Է��ϼ��� : ");
		int n = Integer.parseInt(br.readLine());

		int i = 0;	// for�� �ۿ����� ����ϱ� ���� ���������� ���
		
		for (i = 2; i <= n; i++) {
			if (n % i == 0) {
				break;	// break�� ���� i�� n���� �������� ���ϰ� �ݺ��� ����
			}
		}
		
		if(i == n) {
			bw.write(n+ "��(��) �Ҽ��Դϴ�.");			
		}else {
			bw.write(n + "��(��) �Ҽ��� �ƴմϴ�.");
		}

		bw.flush();
		bw.close();

	} // end of main
} // end of class
