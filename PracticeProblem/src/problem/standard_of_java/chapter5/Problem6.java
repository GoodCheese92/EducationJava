package problem.standard_of_java.chapter5;

public class Problem6 {
	public static void main(String[] args) {
		// �Ž������� �� ���� �������� ������ �� �ִ����� ���
		// ���� money�� �ݾ��� �������� �ٲپ��� �� ���� �� ���� ������ �ʿ����� ����ؼ� ���
		// ��, ������ �� ���� ���� �������� �Ž��� �־�� �Ѵ�.
		
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money = "+money);
		
		for(int i=0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i]+"�� ���� : "+money/coinUnit[i]+"��");
			money %= coinUnit[i];
			
		}
		
		
	} // end of main
} // end of class
