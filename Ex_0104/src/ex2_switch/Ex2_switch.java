package ex2_switch;

public class Ex2_switch {
	public static void main(String[] args) {
		String str = "B";
		
		switch(str) {// �񱳰�
		case "A": // ���ǰ�
			System.out.println("90 ~ 100");
			break;
		case "B":
			System.out.println("80 ~ 89");
			break;
		case "C":
			System.out.println("70 ~ 79");
			break;
		case "D":
			System.out.println("60 ~ 69");
			break;
		case "F":
			System.out.println("59 ����");
			break;
		default:
			System.out.println("�ùٸ� ������ �Է��ؾ� �մϴ�.");
			break;
		
		}
		
		
	} // main
} // end class
