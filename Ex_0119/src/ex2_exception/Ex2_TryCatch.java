package ex2_exception;

public class Ex2_TryCatch {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30};

		// ������ ���ؼ� ������ �߻����� �ʰ� �� �� �ִٸ�
		// try-catch�� ���θ� �ȵȴ�. -> �ٸ� ��쿡 ���� ���� ���� ������
		try {

			for(int i=0; i<=arr.length; i++) {
				System.out.printf("%d ",arr[i]);
			}
			
		} catch(Exception e) {
			
		}
		
		System.out.println("\n���α׷� ����");
		
		
	} // end of main
} // end of class
