package ex4_method;

public class Ex1_paramMain {
	public static void main(String[] args) {
		Ex1_param e1 = new Ex1_param();

		String str = "안녕";
		e1.test1(str);

		System.out.println("main : " + str);

		System.out.println("-------------------------------");

		int[] arr = { 1, 2, 3 };
		e1.test2(arr);		// String을 제외한 객체(배열 포함)을 파라미터로 넘겨주면 주소를 넘겨준다.
		// 따라서 메서드에서 파라미터를 받고 값을 바꾸면 객체의 값을 바꾼다.

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		
		
	} // end of main
} // end of class
