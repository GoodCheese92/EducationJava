package ex1_operator;

public class Ex5_work {
	public static void main(String[] args) {
		/*
		 ���)
		 �Ϸ� ���귮 : 17��
		 �ð� �� ��� : 0.7xxxx��
		 
		 �������� �ִ�.
		 ��, ���, �������� Ű��� �ִµ�, �Ϸ���귮�� ����
		 5, 7, 5����.
		 
		 1) ���������� �Ϸ翡 ����Ǵ� ������ �� ������ ���
		 2) �� �ð��� �� ���� ������ ����Ǵ��� ���
		 
		 ## ��, ������ ������ ������ ������ int Ÿ������,
		 �ð��� ���� ���� ����� ������ float Ÿ������ ���� ��.
		 
		 ## ���� ����� ������ �ڵ�����, �ּ� �� ���� �̻��� ����� ����� �� ��.
		 */
		
		int pear = 5;
		int apple = 7;
		int orange = 5;
		
		System.out.println("-------��� 1-------");
		int total = pear + apple + orange;
		System.out.println("�� �Ϸ� ���귮 : " + total);
		float hour_output = (float)total/24f;
		System.out.println("�ð� �� ���ϻ��귮 : " + hour_output);
		
		System.out.println("-------��� 2-------");
		System.out.println("�� �Ϸ� ���귮 : " + (pear + apple + orange));
		System.out.println("�ð� �� ���ϻ��귮 : " + (float)total/24f);
		
		
		
	
		
		
		
	} // main
} // class end
