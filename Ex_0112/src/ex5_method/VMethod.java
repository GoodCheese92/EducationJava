package ex5_method;

public class VMethod {
	// (int... n) -> variable argument
	// Ÿ�Ը� ��ġ�Ѵٸ� ������ ������ ���� �Ķ���� ��� ���� 
	
	public void v_test(int... n) {	// �ڷ��� �ڿ� ...�� ���̸� �Ķ������ ���� ������� ���� �� �ִ�.
		// �Ķ���͸� �ٲ��ָ� �˾Ƽ� int[] n = new int[����]; �� �����ȴ�.
		
		// n = {1, 10, 3, 8};
		for(int i=0; i<n.length; i++) {
			System.out.println(n[i]);
		}
	}
	
	
} // end of class
