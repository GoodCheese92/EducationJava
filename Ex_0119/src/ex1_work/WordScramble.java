package ex1_work;

import java.util.Random;

public class WordScramble {
	// 정답 및 섞인 단어를 반환하는 클래스
	String[] strArr = { "Apple", "View", "Blue", "Banana" };
	String shake = ""; // 단어를 섞어서 저장할 객체

	// 정답을 반환하는 메서드
	public String getAnswer() {
		// Random rnd = new Random();
		// int idx = rnd.nextInt();

		// 난수를 익명 클래스로 생성했다.
		// rnd, sc 등과 같이 객체의 이름을 저장하지 않고 new를 통해
		// 바로 사용하고 사용한 뒤, 그 자리에서 제거하는 형태로 사용하는 방식을
		// 익명 클래스라고 한다.
		int idx = new Random().nextInt(strArr.length);
		return strArr[idx];

	} // end of getAnswer()
	
	// 정답을 섞어서 문제로 만들어주는 메서드
	public String getScrambleWord(String word) {
		// word : Blue
		
		// 정답을 문자 단위로 끊어서 저장
		int[] inArr = new int[word.length()];
		
		// 만들어진 inArr배열에 겹치지 않는 난수값을 채워넣는다.
		outer : for(int i=0; i<inArr.length;) {
			inArr[i] = new Random().nextInt(word.length());
			
			// 중복체크
			for(int j=0;j<i;j++) {
				if(inArr[i] == inArr[j]) {
					continue outer;
				}
			} // inner
			
			i++;
		} // outer
		
		for(int i=0;i<inArr.length;i++) {
			shake += word.charAt(inArr[i]);
		}
		
		return shake; // 섞인 문자열을 반환
		
	} // end of getScrambleword()
	
	
	
	
	

} // end of class


























