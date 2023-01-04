package ex2_switch;

public class Ex4_work {
	public static void main(String[] args) {
		// 1) 8월은 31일까지 있습니다.
		// 2) 4월은 30일까지 있습니다.
		// 3) 13월은 없습니다.
		// 4) 2월은 28일 또는 29일까지 있습니다.
		int month = 23;
		int date1 = 30;
		int date2 = 31;
		int date3 = 28;
		
		// 방법 1
		if (month == 2) {
			System.out.println(month+"월은 "+date3+"일까지 있습니다.");
		}else if (month >= 1 && month <= 7) {
			switch(month%2) {
			case 0:
				System.out.println(month+"월은 "+date1+"일까지 있습니다.");
				break;
			case 1:
				System.out.println(month+"월은 "+date2+"일까지 있습니다.");
				break;
			}			
		}else if(month>=8 && month<=12) {
			switch(month%2) {
			case 1:
				System.out.println(month+"월은 "+date1+"일까지 있습니다.");
				break;
			case 0:
				System.out.println(month+"월은 "+date2+"일까지 있습니다.");
				break;
			}
		} else {
			System.out.println("해당 월은 없습니다.");
		} // if

		
		System.out.println("-----------------------------------");
		// 방법2
		switch(month) {
		case 1:
			System.out.println(month+"월은 "+date2+"일까지 있습니다.");
			break;		
		case 2:
			System.out.println(month+"월은 "+date3+"일까지 있습니다.");
			break;
		case 3:
			System.out.println(month+"월은 "+date2+"일까지 있습니다.");
			break;		
		case 4:
			System.out.println(month+"월은 "+date1+"일까지 있습니다.");
			break;
		case 5:
			System.out.println(month+"월은 "+date2+"일까지 있습니다.");
			break;		
		case 6:
			System.out.println(month+"월은 "+date1+"일까지 있습니다.");
			break;
		case 7:
			System.out.println(month+"월은 "+date2+"일까지 있습니다.");
			break;		
		case 8:
			System.out.println(month+"월은 "+date2+"일까지 있습니다.");
			break;
		case 9:
			System.out.println(month+"월은 "+date1+"일까지 있습니다.");
			break;		
		case 10:
			System.out.println(month+"월은 "+date2+"일까지 있습니다.");
			break;
		case 11:
			System.out.println(month+"월은 "+date1+"일까지 있습니다.");
			break;		
		case 12:
			System.out.println(month+"월은 "+date2+"일까지 있습니다.");
			break;
		default:
			System.out.println("해당 월은 없습니다.");
		}
		
		
		System.out.println("-----------------------------------");
		// 방법 3
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
			System.out.println(month+"월은 "+date+"일까지 입니다.");
		}else {
			System.out.println("해당 월은 없습니다.");
		}
		
	} // main
}
