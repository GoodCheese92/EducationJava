package problem.standard_of_java.chapter5;

public class Problem11 {
	public static void main(String[] args) {
		// �־��� 2���� �迭�� �����ͺ��� ���ο� ���η� 1�� �� ū �迭�� �����ؼ� �迭�� ��� ���� ������ ��ҿ�
		// �� ���� ���� ������ �����ϰ� ����ϴ� ���α׷��̴�.

		int[][] score = { 	{100, 100, 100},
							{20, 20, 20},
							{30, 30, 30},
							{40, 40, 40},
							{50, 50, 50}	};
		
		int[][] result = new int[score.length+1][score[0].length+1];
		
		for(int i=0; i<score.length; i++) {
			for(int j=0;j<score[i].length;j++) {
				score[i][score[i].length-1] += score[i][j];
				
				score[score.length-1][j] += score[j][i];
			}
		}
		
		for(int i=0; i < result.length;i++) {
			for(int j=0; j < result[i].length;j++) {
				System.out.printf("%4d",result[i][j]);
			}
				System.out.println();
			}	

	} // end of main
} // end of class
