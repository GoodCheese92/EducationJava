package ex7_work;

public class Calculator_ex {
	// 강사님 코드
	public void getResult(String operator, int...n){	// variable argument 사용 시, 뒤에 파라미터 넣으면 오류, 앞에 넣으면 가능
		
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
			result = String.format("잘못 입력하였습니다.");
		} // switch
		
		System.out.println(result);
	}
	
} // end of class
