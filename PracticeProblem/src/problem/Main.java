package problem;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		int C = sc.nextInt();

		sc.close();

		int total = 0;

		if (A == B && A == C) {
			total = 10000 + A * 1000;
		} else if (A == B || A == C || B == C) {
			total = 1000 + A * 100;
			if (B == C)
				total = 1000 + B * 100;
		} else {
			total = Math.max(A, Math.max(B, C)) * 100;
		}
		System.out.println(total);

	}
}