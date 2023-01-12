package ex7_work;

public class Calculator {
	public void getResult(int su1, String str, int su2){
		switch(str) {
		case "+":
			System.out.printf("%d + %d = %d", su1, su2, su1+su2);
			break;
		case "-":
			System.out.printf("%d - %d = %d", su1, su2, su1-su2);
			break;
		case "*":
			System.out.printf("%d * %d = %d", su1, su2, su1*su2);
			break;
		case "/":
			System.out.printf("%d / %d = %d", su1, su2, su1/su2);
			break;
		case "%":
			System.out.printf("%d %% %d = %d", su1, su2, su1%su2);
			break;
		default:
			System.out.println("잘못 입력하였습니다.");				
		}
	}
	
	
} // end of class
