package ex5_interface;

public class Kitchen implements AllMenu {
//public class Kitchen implements Menu1, Menu2, Menu3{
	// �������̽��� �����ɷ��� ���� ������
	// �ϳ��� Ŭ�������� �������� ���(����)�� ����
	
	@Override
	public String jjajang() {
		return "�߸� + ����ҽ�";
	}

	@Override
	public String jjambbong() {
		return "���߱⸧ + ���� �ع�";
	}
	
	@Override
	public String tangsuyuck() {
		return "������� + ���� + ���...";
	}
	
	@Override
	public String boggembab() {
		return "��õ�� + �ް� ���...";
	}
	
	@Override
	public String mando() {
		return "�а��� + ��� ������";
	}
	
	@Override
	public String rajogi() {
		return "�������� ��� �������";
	}
	
} // end of class
