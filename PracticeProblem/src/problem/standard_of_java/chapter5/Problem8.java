package problem.standard_of_java.chapter5;

public class Problem8 {
	public static void main(String[] args) {
		// answer�� ��� �����͸� �а� �� ������ ������ ��� ������ŭ '*'�� �� �׷����� �׸��� ���α׷�
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];

		for (int i = 0; i < answer.length; i++) {
			for(int j=0; j<counter.length; j++) {
				if(answer[i] - 1 == j)
				counter[j]++;
			}
		}
		
		for (int i = 0; i < counter.length; i++) {
			for(int j = 0; j<counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		

	} // end of main
} // end of class
