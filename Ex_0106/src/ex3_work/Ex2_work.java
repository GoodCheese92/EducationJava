package ex3_work;

public class Ex2_work {
	public static void main(String[] args) {
		// �迭 arr�� ��� �� �� ���� ū ���� ���
		// ��� : 19
		
		int[] arr = new int[6];
		arr[0] = 4;
		arr[1] = 13;
		arr[2] = 7;
		arr[3] = 19;
		arr[4] = 1;
		arr[5] = 15;
		
		int a = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(a<arr[i]) {
				a = arr[i];
			}

		}
		System.out.println("���� ū �� : " + a);
		
	} // end of main
} // end of class
