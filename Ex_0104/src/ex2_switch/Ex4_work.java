package ex2_switch;

public class Ex4_work {
	public static void main(String[] args) {
		// 1) 8���� 31�ϱ��� �ֽ��ϴ�.
		// 2) 4���� 30�ϱ��� �ֽ��ϴ�.
		// 3) 13���� �����ϴ�.
		// 4) 2���� 28�� �Ǵ� 29�ϱ��� �ֽ��ϴ�.
		int month = 23;
		int date1 = 30;
		int date2 = 31;
		int date3 = 28;
		
		// ��� 1
		if (month == 2) {
			System.out.println(month+"���� "+date3+"�ϱ��� �ֽ��ϴ�.");
		}else if (month >= 1 && month <= 7) {
			switch(month%2) {
			case 0:
				System.out.println(month+"���� "+date1+"�ϱ��� �ֽ��ϴ�.");
				break;
			case 1:
				System.out.println(month+"���� "+date2+"�ϱ��� �ֽ��ϴ�.");
				break;
			}			
		}else if(month>=8 && month<=12) {
			switch(month%2) {
			case 1:
				System.out.println(month+"���� "+date1+"�ϱ��� �ֽ��ϴ�.");
				break;
			case 0:
				System.out.println(month+"���� "+date2+"�ϱ��� �ֽ��ϴ�.");
				break;
			}
		} else {
			System.out.println("�ش� ���� �����ϴ�.");
		} // if

		
		System.out.println("-----------------------------------");
		// ���2
		switch(month) {
		case 1:
			System.out.println(month+"���� "+date2+"�ϱ��� �ֽ��ϴ�.");
			break;		
		case 2:
			System.out.println(month+"���� "+date3+"�ϱ��� �ֽ��ϴ�.");
			break;
		case 3:
			System.out.println(month+"���� "+date2+"�ϱ��� �ֽ��ϴ�.");
			break;		
		case 4:
			System.out.println(month+"���� "+date1+"�ϱ��� �ֽ��ϴ�.");
			break;
		case 5:
			System.out.println(month+"���� "+date2+"�ϱ��� �ֽ��ϴ�.");
			break;		
		case 6:
			System.out.println(month+"���� "+date1+"�ϱ��� �ֽ��ϴ�.");
			break;
		case 7:
			System.out.println(month+"���� "+date2+"�ϱ��� �ֽ��ϴ�.");
			break;		
		case 8:
			System.out.println(month+"���� "+date2+"�ϱ��� �ֽ��ϴ�.");
			break;
		case 9:
			System.out.println(month+"���� "+date1+"�ϱ��� �ֽ��ϴ�.");
			break;		
		case 10:
			System.out.println(month+"���� "+date2+"�ϱ��� �ֽ��ϴ�.");
			break;
		case 11:
			System.out.println(month+"���� "+date1+"�ϱ��� �ֽ��ϴ�.");
			break;		
		case 12:
			System.out.println(month+"���� "+date2+"�ϱ��� �ֽ��ϴ�.");
			break;
		default:
			System.out.println("�ش� ���� �����ϴ�.");
		}
		
		
		System.out.println("-----------------------------------");
		// ��� 3
		int n = 0;
		int date = 0;
		if(month == 2) {
			date = 28;
		}else if(month>=1 && month<=7) {
			switch(month%2) {
			case 1:
				date = 31;
				break;
			case 0:
				date = 30;
				break;
			}
		}else if(month>=8 && month <= 12) {
			switch(month%2) {
			case 0:
				date = 31;
				break;
			case 1:
				date = 30;
				break;
			}
		} // if
		
		if(month>=1 && month<=12) {
			System.out.println(month+"���� "+date+"�ϱ��� �Դϴ�.");
		}else {
			System.out.println("�ش� ���� �����ϴ�.");
		}
		
	} // main
}
