package ex9_break_continue;

public class Ex3_Continue {
	public static void main(String[] args) {
		// continue�� : �ݺ��� ������ Ư�� ������ �����ϰ� �ǳʶٰ��� �� �� ���Ǵ� Ű����
		// continue���� ���� ����� �ݺ����� ������ �ȴ�.( {}<---�ȿ� ����ִ� �ڵ�)
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 5; j++) {
				
				if (j % 2 == 0) {
					// for�� ������ continue�� ������ 
					// ���� ����� for���� ���������� �ǳʶڴ�.(�Ʒ��� ������ �������� �ʴ´�.)
					// �������� ���࿡ {} ������ ���ͼ� �ۼ��� �Ǿ� �ִٸ� -> ���ǽ����� �ǳʶڴ�.
					// -- ���� for������ �ǵ������� �������� �����ߴٸ�,
					// -- �ش� for���� ���ǽ����� �ǳʶڴ�.
					continue;
					//System.out.println("������ �� ���� �ڵ�");
				}
				System.out.printf("%d ", j);
			} // inner
			System.out.println();
		} // outer

	} // end of main
} // end of class
