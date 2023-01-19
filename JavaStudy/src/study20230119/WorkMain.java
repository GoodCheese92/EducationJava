package study20230119;

public class WorkMain {
	public static void main(String[] args) {
//		1 ~ 100 사이의 난수 두 개를 더하는 문제를 출제
//		키보드에서 답을 입력하여 다섯 문제가 정답처리 될 때까지 코드가 반복
//		최종적으로 다섯문제를 모두 맞히는데 몇초가 걸렸는지 화면에 출력하며 코드를 종료
//		
//		-----------------------------
//		20 + 15 = 35(입력)
//		정답!
//		100 + 66 = 11
//		오답...
//		61 + 51 = 112
//		정답!
//		......
//      53 + 28 = 81;
//		정답!
//		5문제를 처리하는데 24초가 걸렸습니다
		
		PlusQuestion pq = new PlusQuestion();
		int answerCount = 5;
		pq.start();
		pq.howTime(answerCount);
	}
}
