package ex1_work;

import java.util.Random;

public class WordScramble {
	// ���� �� ���� �ܾ ��ȯ�ϴ� Ŭ����
	String[] strArr = { "Apple", "View", "Blue", "Banana" };
	String shake = ""; // �ܾ ��� ������ ��ü

	// ������ ��ȯ�ϴ� �޼���
	public String getAnswer() {
		// Random rnd = new Random();
		// int idx = rnd.nextInt();

		// ������ �͸� Ŭ������ �����ߴ�.
		// rnd, sc ��� ���� ��ü�� �̸��� �������� �ʰ� new�� ����
		// �ٷ� ����ϰ� ����� ��, �� �ڸ����� �����ϴ� ���·� ����ϴ� �����
		// �͸� Ŭ������� �Ѵ�.
		int idx = new Random().nextInt(strArr.length);
		return strArr[idx];

	} // end of getAnswer()
	
	// ������ ��� ������ ������ִ� �޼���
	public String getScrambleWord(String word) {
		// word : Blue
		
		// ������ ���� ������ ��� ����
		int[] inArr = new int[word.length()];
		
		// ������� inArr�迭�� ��ġ�� �ʴ� �������� ä���ִ´�.
		outer : for(int i=0; i<inArr.length;) {
			inArr[i] = new Random().nextInt(word.length());
			
			// �ߺ�üũ
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
		
		return shake; // ���� ���ڿ��� ��ȯ
		
	} // end of getScrambleword()
	
	
	
	
	

} // end of class


























