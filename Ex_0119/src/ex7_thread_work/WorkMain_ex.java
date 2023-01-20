package ex7_thread_work;

public class WorkMain_ex {
	public static void main(String[] args) {
		/*
		 1 ~ 100 사이의 난수 두 개를 더하는 문제를 출제
		 키보드에서 답을 입력하여 다섯 문제가 정답처리될 때 까지 코드가 반복
		 최종적으로 다섯문제를 모두 맞히는데 몇 초가 걸렸는지 화면에 출력하며 코드를 종료
		 ---------------------------------------------------
		 20 + 15 = 35
		 정답!!
		 100 + 66 = 11
		 오답..
		 61 + 51 = 112
		 정답!!
			.....
		53 + 28 = 81
		정답!!
		5문제를 처리하는데 24초가 걸렸습니다.
		 */
		
		ThreadWork_ex work = new ThreadWork_ex();
		
		work.start();	// run() - 타이머를 동작시킨다.
		work.gameStart();
		
		
		
		
		
		
		
		
	} // end of main
} // end of class











