package ex7_work;

public class Calculator_ex {
	// ����� �ڵ�
	public void getResult(String operator, int...n){	// variable argument ��� ��, �ڿ� �Ķ���� ������ ����, �տ� ������ ����
		
		String result = "";
		
		switch(operator) { // +, -, *, /, %
		case "+":
			// result = n[0] + "+" + n[1] + "=" + (n[0] + n[1]);
			result = String.format("%d + %d = %d", n[0], n[1], n[0]+n[1]);
			break;
			// System.out.printf("%d %s %d = %d", n[0], operator, n[1], n[0]+n[1]);
		case "-":
			result = String.format("%d - %d = %d", n[0], n[1], n[0]-n[1]);
			break;
		case "*":
			result = String.format("%d * %d = %d", n[0], n[1], n[0]*n[1]);
			break;
		case "/":
			result = String.format("%d / %d = %d", n[0], n[1], n[0]/n[1]);
			break;
		case "%":
			result = String.format("%d % %d = %d", n[0], n[1], n[0]%n[1]);
			break;
		default :
			result = String.format("�߸� �Է��Ͽ����ϴ�.");
		} // switch
		
		System.out.println(result);
	}
	
} // end of class
