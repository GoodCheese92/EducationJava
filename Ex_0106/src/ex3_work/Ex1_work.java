package ex3_work;

public class Ex1_work {
	public static void main(String[] args) {
		// �迭 arr�� ��� �ִ� ��� ������ ���� ���
		// ��� : 67
		
		// ����� ������ ���ٷ� ǥ���� �� �ִ�.		
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 24;
		arr[2] = 7;
		arr[3] = 16;
		arr[4] = 10;
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
		
		
	} // end of main
} // end of class
