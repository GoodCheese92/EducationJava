package ex4_interface;

public class InterChild implements InterTest{
	// �������̽��� implements Ű���带 ���ؼ� '����'�Ѵ�.
	
	@Override
	public int getVALUE() {
		// ����� ���� ������ �� ����.
		// VALUE += 3; -> ����� �Ұ���
		return VALUE;
	}
	
	
} // end of class
