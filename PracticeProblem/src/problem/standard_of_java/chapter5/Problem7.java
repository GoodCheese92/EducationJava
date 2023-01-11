package problem.standard_of_java.chapter5;

public class Problem7 {	
	public static void main(String[] args) {
		// ������ ������ �߰��� ���α׷�
		// Ŀ�ǵ� �������κ��� �Ž��� �� �ݾ��� �Է¹޾� ���
		// ������ �������� �Ž������� ������ �� ������ -> '�Ž������� �����մϴ�.' ���
		// ������ ���� ����ϸ� �Ž��� ���� ������ ��ŭ ���� ������ ���� ���� ������ ������ ȭ�鿡 ���
		
		if(args.length != 1) {
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
		}
		
		// ���ڿ��� ���ڷ� ��ȯ�Ѵ�. �Է��� ���� ���ڰ� �ƴ� ��� ���ܰ� �߻��Ѵ�.
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money = "+money);
		
		int[] coinUnit = {500, 100, 50, 10};	// ������ ����
		int[] coin = {5, 5, 5, 5};				// ������ ������ ����
		
		for(int i=0; i<coinUnit.length; i++) {
			int coinNum = 0;
			
			// ���� -> ���� �ۼ��� �κ�
			coinNum = money/coinUnit[i];
			if(coin[i]>=coinNum) {
				coin[i] -= coinNum;				
			}else {
				coin[i] -= coin[i];
			}
			money = coinNum*coinUnit[i];
			
			System.out.println(coinUnit[i]+"�� : "+coinNum);
		}
		
		if(money>0) {
			System.out.println("�Ž������� �����մϴ�.");
			System.exit(0);	// ���α׷��� �����Ѵ�.
		}
		
		System.out.println("=���� ������ ����=");
		
		for(int i=0; i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"��: "+coin[i]);
		}
		
	} // end of main
} // end of class
