package ex1_multi_array;

public class Ex3_multi_array {
	public static void main(String[] args) {
		// ���� �迭�� ������ �����ϵ��� �ؾ��Ѵ�.
		int[][] num = new int[2][];
		num[0] = new int[3];
		num[1] = new int[2];
		
		num[0][0] = 10;
		num[0][1] = 20;
		num[0][2] = 30;

		num[1][0] = 40;
		num[1][1] = 50;
		
		// num �迭�� ��� ���� ���
		for(int i=0; i<num.length;i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.print(num[i][j]+" ");
			} // inner
			System.out.println();
		} // outer
		
		
		
	} // end of main
} // end of class
