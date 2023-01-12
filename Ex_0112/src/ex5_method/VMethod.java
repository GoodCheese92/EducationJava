package ex5_method;

public class VMethod {
	// (int... n) -> variable argument
	// 타입만 일치한다면 개수의 제한이 없는 파라미터 사용 가능 
	
	public void v_test(int... n) {	// 자료형 뒤에 ...을 붙이면 파라미터의 개수 상관없이 넣을 수 있다.
		// 파라미터를 바꿔주면 알아서 int[] n = new int[개수]; 로 생성된다.
		
		// n = {1, 10, 3, 8};
		for(int i=0; i<n.length; i++) {
			System.out.println(n[i]);
		}
	}
	
	
} // end of class
