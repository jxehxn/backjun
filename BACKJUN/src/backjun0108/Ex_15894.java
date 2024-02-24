package backjun0108;

import java.util.Scanner;

public class Ex_15894 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		if (( (A > 0 &&A < 180)&& (B > 0&& B<180)) && (C > 0&& C<180)) {
			if (A + B == 180 - C) {
				if (A == 60 && B == 60) {
					if (C == 60) {
						System.out.println("Equilateral");
					}
				} else if (A == B || B == C || A == C) {
					System.out.println("Isosceles");
				} else if (A != B && A != C) {
					if (B != C) {
						System.out.println("Scalene");
					}
				} else {
					System.out.println("Error");
				}
			}else {
				System.out.println("Error");
				}
			
		}else {
			System.out.println("Error");
			}
	}

}
