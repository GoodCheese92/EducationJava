package problem.standard_of_java.chapter5;

public class Problem3 {
	public static void main(String[] args) {
		// 5-3 �迭 arr�� ��� ��� ���� ���ϴ� ���α׷��� �ϼ��Ͻÿ�. 
		
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum = " + sum);

	} // end of main
} // end of class
