package ex8_work;

public class Ex1_work {
	public static void main(String[] args) {
		// 1. 2�� for���� ����Ͽ� �Ʒ��� ����� ����Ͻÿ�.
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("----------------------------------");

		// ����� �ڵ�
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("* ");
			} // inner
			System.out.println();
		} // outer
		
		System.out.println("----------------------------------");
		// 2. 2�� for���� ����Ͽ� �Ʒ��� ����� ����Ͻÿ�. (���� �������� Ǯ ��)
		//         *
		//       * * *
		//     * * * * *
		//   * * * * * * *
		// * * * * * * * * *
		
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < (5 - i) * 2; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {	// 2n-1 : ���� ����
				System.out.print("* ");				
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------");
		
		// ����� �ڵ�
		// ���� for���� ��� ���� ������ �����ϴ� ���̹Ƿ�
		// ���п����� ��İ� ����ϰ� �����ϸ� �˰��� ���� Ǫ�µ� ������ �� �� ����.
		// ex) �� ��� ��ȣ�� �°� - ���� ��ȣ�� outer for���� i�� index����, ���� ��ȣ�� inner for���� j�� index����
		// ��İ��� �ݴ� ����....
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
		// 00 01 02 03 04
		// 10 11 12 13 14
		// 20 21 22 23 24
		// 30 31 32 33 34
		// 40 41 42 43 44
		
		System.out.println("-----------------------------------");
		for(int i=0; i<5; i++) {
			for(int j = 0; j<5+i; j++) {
				if(i + j > 3) {
					System.out.print("* ");					
				} else {
					System.out.print("  ");
				}
				
			} // inner
			System.out.println();
		} // outer
		
		System.out.println("-----------------------------------");
		
		for(int i = 3; i>=0; i--) {
			for(int j=0; j<5+i; j++) {
				if(i + j >3) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			} // inner
			System.out.println();
		} // outer
		
		
		
		
		
		
		
	} // end of main
} // end of class
