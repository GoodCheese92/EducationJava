package ex1_class;

public class Computer {
	// Ŭ������ �������
	// 1) ����, �Ӽ�, ��� ...
	// 2) �޼���, �Լ�, ���

	// ��ǻ�͸� ����� ���� ���� �۾�
	private String brand = "apple";
	public int ssd = 256;
	int ram = 16;
	float cpu = 2.4f;
	String color = "white";

	// ��ǻ���� ������ Ȯ���ϱ� ���� �޼���(���)
	// �޼��� : �ݺ������� ���Ǵ� �ڵ带 ���̱� ���ؼ� ����� ����
	public void getInfo() {
		System.out.println("������ : "+ brand);
		System.out.println("ssd : " + ssd);
		System.out.println("ram : " + ram);
		System.out.println("cpu : " + cpu);
		System.out.println("color : " + color);
		System.out.println("--------------------------");
	}
	
	// �޼����� ����
	// ����������	��ȯ��	�޼����(�Ķ����, ����, �Ű�����) 	{�żҵ� ȣ�� �� ���࿵��}
	// public	void	getInfo(				)	{				}
	// �޼���� �ҹ��ڷ� �ǵ��� �����ؾ� �Ѵ�.

	// ����������
	// 1) public : ���� ������Ʈ ���� ��� ��ü�鿡�� ��� �㰡
	// 2) private : ���� Ŭ���������� ����� �㰡
	// 3) protected : ��� ������ ��ü�鿡�Ը� ����� �㰡
	// 4) (default) : ���� ��Ű�� ���� ��ü�鿡�� ����� �㰡

} // end of class
