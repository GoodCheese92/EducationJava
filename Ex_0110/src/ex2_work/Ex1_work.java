package ex2_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		// Ű���忡�� �Է¹��� �� ��ŭ �Ǻ���ġ ���� ����ϱ�
		
		// �Է� : 5
		// 1 1 2 3 5 8 13 ...
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ������ �Ǻ���ġ ������ ������ �Է��ϼ��� : ");
		int n = sc.nextInt();
				
		int[] arr = new int[n];
//		arr[2] = arr[0] + arr[1];
//		System.out.println(arr[2]);
		for(int i=0;i<arr.length; i++) {
			if(i>=2) {
			arr[i] = arr[i-2] + arr[i-1];
			}else if(i == 0){
				arr[0] = 1;
			}else if(i == 1) {
				arr[1] = 1;								
			}
			System.out.print(arr[i]+" ");
		}
		
		
		
		
	} // end of main
} // end of class
