package ex9_break_continue;

public class Ex2_Break {
	public static void main(String[] args) {
		
		// break는 반복문에서 사용 되지만 유일하게 switch문에서 사용 된다.
		// 따라서, switch문에서 break가 사용되면 switch문을 끝낼 때 사용되고
		// for문에서는 적용이 안된다.
		for(int i = 0; i < 3; i++) {
			switch(i) {
			case 0:
				System.out.println("0입니다.");
				break;	// switch 내부의 break는 반복문이 아닌, switch문만 탈출
		
			case 1:
				System.out.println("1입니다.");
				break;
			} // switch
		} // for
		
		
	} // end of main
} // end of class
