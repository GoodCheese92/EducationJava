package ex2_exception;

public class Ex1_TryCatch {
	public static void main(String[] args) {
		// Try-Catch(예외처리) : 프로그램 실행 중 예외(오류, 에러...)가 발생하면
		// 그 시점에서 프로그램이 강제적으로 종료된다.
		// 때로는 예상 가능한 오류에 대해 예외가 발생해도 이를 무시하거나 수정하여
		// 계속 코드를 진행해야 할 때가 있다.
		// 예외 처리기법을 통해 프로그램의 비 정상적인 종료를 줄여보자!!
		
		// 대표적인 예시 : 계산기 코드에서 입력을 받을 때, 0으로 나누는 경우가 프로그램을 실행했을 때 말고는 막을 수 없다.
		// 또는 Scanner 사용 시, sc.nextInt()로 입력을 받아야 하는데 다른 자료형으로 입력을 받을 때
		
		int result = 0;
		
		int[] arr = new int[3];
		
		
		
		try {
			// try 영역에서 오류가 발생하지 않았다면, catch 구문을
			// 거치지 않고 그대로 빠져나간다.
			result = 10 / 0;
			arr[3] = 1;

			System.out.println("오류없음.");
		} catch(ArrayIndexOutOfBoundsException e) {
			// 위의 try영역에서 오류가 발생하면
			// 반드시 catch 구문을 실행한다.
			//e.printStackTrace();	// 현재 발생한 예외의 이름
			
			System.out.println("배열의 존재하지 않는 index에 접근했습니다.");
		} catch(ArithmeticException e) {
			System.out.println("정수는 0으로 나눌 수 없습니다.");
		} finally {
			// try 영역에서의 예외발생 여부와 관계없이
			// 무조건 실행되는 영역
			System.out.println("finally");
			
		}
		
		System.out.println("결과 : " + result);

	
	} // end of main
} // end of class
