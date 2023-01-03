package ex1_operator;

public class Ex4_work {
	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		
//		int res = ++a >= b || 2+7 <= b && 13-b >= 0 && (a+=b) - (a%b) > 10 ? 1 : 0;	// true
//		System.out.println(res);
//		System.out.println((a+=b) - (a%b));
//		System.out.println(23%12);
		System.out.println(++a >= b);
		System.out.println(2+7 <= b);
		System.out.println(13-b >= 0);
//		System.out.println((a+=b) - (a%b) > 10);
		System.out.println((a+=b));
		System.out.println((a%b));
		
		
		
	} // main
} // class end
