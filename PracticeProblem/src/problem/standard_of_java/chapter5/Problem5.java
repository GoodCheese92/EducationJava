package problem.standard_of_java.chapter5;

public class Problem5 {
	public static void main(String[] args) {
		// ������ 1�� 9������ �ߺ����� ���� ���ڷ� �̷���� 3�ڸ� ���ڸ� ����� ���� ���α׷��̴�. (1)~(2)�� �˸��� �ڵ带 �־ ���α׷��� �ϼ��Ͻÿ�.
		int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] ball3 = new int[3];
		
		// �迭 ballArr�� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�.
		for(int i=0; i<ballArr.length; i++) {
			int j = (int)(Math.random()*ballArr.length);
			int tmp = 0;
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
			
			
			
			
			
		}
		
		// �迭 ballArr�� �տ��� 3���� ���� �迭 ball3�� �����Ѵ�.
		System.arraycopy(ballArr, 0, ball3, 0, 3);
		
		
	for(int i=0;i<ball3.length; i++) {
		System.out.print(ball3[i]);
	}
	System.out.println();
		
	} // end of main
} // end of class
