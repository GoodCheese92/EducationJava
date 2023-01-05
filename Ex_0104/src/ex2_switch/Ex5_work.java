package ex2_switch;

public class Ex5_work {
	public static void main(String[] args) {
		// 10 + 5 = 15
		// 8 * 3 = 24
		
		int su1 = 3;
		int su2 = 5;
		char op = '+';	// +, -, *, /, % 중 하나 원하는 연산자 넣기
		
		switch(op) {
		case '+':
			System.out.println(su1+" + "+su2+" = "+(su1+su2));
			break;
		case '-':
			System.out.println(su1+" - "+su2+" = "+(su1-su2));
			break;
		case '*':
			System.out.println(su1+" * "+su2+" = "+(su1*su2));
			break;
		case '/':
			System.out.println(su1+" / "+su2+" = "+(su1/su2));
			break;
		case '%':
			System.out.println(su1+" % "+su2+" = "+(su1%su2));
			break;		
		} //switch
		
	} // end of main
} // end of class
