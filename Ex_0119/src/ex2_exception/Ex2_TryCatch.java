package ex2_exception;

public class Ex2_TryCatch {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30};

		// 수정을 통해서 오류가 발생하지 않게 할 수 있다면
		// try-catch로 감싸면 안된다. -> 다른 경우에 쓰일 때가 많기 때문에
		try {

			for(int i=0; i<=arr.length; i++) {
				System.out.printf("%d ",arr[i]);
			}
			
		} catch(Exception e) {
			
		}
		
		System.out.println("\n프로그램 종료");
		
		
	} // end of main
} // end of class
