package ex3_work;

public class Ex2_work {
	public static void main(String[] args) {
		// �迭 arr�� ��� �� �� ���� ū ���� ���
		// ��� : 19

		int[] arr = { 4, 13, 7, 19, 1, 15 };
//		int[] arr = new int[6];
//		arr[0] = 4;
//		arr[1] = 13;
//		arr[2] = 7;
//		arr[3] = 19;
//		arr[4] = 1;
//		arr[5] = 15;

		int a = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (a < arr[i]) {
				a = arr[i];
			}
		}
		System.out.println("���� ū �� : " + a);

//		for(int i=0; i<arr.length; i++) {
//			a = Math.max(arr[i], arr[i]);
//		}

//		for(int e : arr) {
//			
//		}

		System.out.println("--------------------------------");

		// ����� �ڵ�
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i]; // max = 13;
			}
		}
		System.out.println("���� ū �� : " + max);

		System.out.println("-----------------------------------");

		// arr�� ���� ���� ������������ ���� -> sort��� �Լ��� ��� ����
		// ����� �ڵ�
		// �迭�� �� ó������ �ڿ� �ִ� �͵��� �� ���ؼ� ������ ���� �ּڰ��� �� �������� ������ �� 
		for(int i=0; i<arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				if(arr[j]<arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			} // inner
		} // outer
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("-----------------------------");
		
		// �� �ڵ�
		arr[0] = 4;
		arr[1] = 13;
		arr[2] = 7;
		arr[3] = 19;
		arr[4] = 1;
		arr[5] = 15;
		
		


	} // end of main
} // end of class
