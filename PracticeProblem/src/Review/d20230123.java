package Review;

public class d20230123 {
	public static void main(String[] args) {
		/*
		 ÀÚ·áÇü
		 1. boolean - 1bit
		 2. char - 2byte
		 3. byte - 1byte
		 4. short - 2byte
		 5. int - 4byte
		 6. long - 8byte
		 7. float - 4byte
		 8. double  - 8byte
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------");
		for(int i=0; i<5; i++) {
			for(int j=0; j< 5 + i; j++) {
				if(i+j > 3) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------");
		for(int i=1; i<=10; i++) {
			for(int j=i; j<=i+9;j++) {
				if(j>10) {
					int tmp = j;
					tmp %= 10;
					System.out.print(tmp + " ");
				}else {
					System.out.print(j + " ");					
				}
			}
			System.out.println();
		}
		
	} // end of main
} // end of class
