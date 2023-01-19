package ex2_exception;

public class Ex1_TryCatch {
	public static void main(String[] args) {
		// Try-Catch(����ó��) : ���α׷� ���� �� ����(����, ����...)�� �߻��ϸ�
		// �� �������� ���α׷��� ���������� ����ȴ�.
		// ���δ� ���� ������ ������ ���� ���ܰ� �߻��ص� �̸� �����ϰų� �����Ͽ�
		// ��� �ڵ带 �����ؾ� �� ���� �ִ�.
		// ���� ó������� ���� ���α׷��� �� �������� ���Ḧ �ٿ�����!!
		
		// ��ǥ���� ���� : ���� �ڵ忡�� �Է��� ���� ��, 0���� ������ ��찡 ���α׷��� �������� �� ����� ���� �� ����.
		// �Ǵ� Scanner ��� ��, sc.nextInt()�� �Է��� �޾ƾ� �ϴµ� �ٸ� �ڷ������� �Է��� ���� ��
		
		int result = 0;
		
		int[] arr = new int[3];
		
		
		
		try {
			// try �������� ������ �߻����� �ʾҴٸ�, catch ������
			// ��ġ�� �ʰ� �״�� ����������.
			result = 10 / 0;
			arr[3] = 1;

			System.out.println("��������.");
		} catch(ArrayIndexOutOfBoundsException e) {
			// ���� try�������� ������ �߻��ϸ�
			// �ݵ�� catch ������ �����Ѵ�.
			//e.printStackTrace();	// ���� �߻��� ������ �̸�
			
			System.out.println("�迭�� �������� �ʴ� index�� �����߽��ϴ�.");
		} catch(ArithmeticException e) {
			System.out.println("������ 0���� ���� �� �����ϴ�.");
		} finally {
			// try ���������� ���ܹ߻� ���ο� �������
			// ������ ����Ǵ� ����
			System.out.println("finally");
			
		}
		
		System.out.println("��� : " + result);

	
	} // end of main
} // end of class
