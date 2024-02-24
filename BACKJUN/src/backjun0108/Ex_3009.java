package backjun0108;

import java.util.Iterator;
import java.util.Scanner;

public class Ex_3009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] X = new int[3];
		int[] Y = new int[3];
		
		int count_x = 0;
		int count_y = 0;
		int result_x = 0;
		int result_y = 0;
		int Last_result_x = 0;
		int Last_result_y = 0;
		
		
		for (int i = 0; i < X.length; i++) {
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
			
		}
		
	
				if (X[0]==X[1]) {
					result_x = X[0];
				}
				if (X[0]==X[2]) {
					result_x = X[0];
				}
				if (X[1]==X[2]) {
					result_x = X[1];
				}
				if (Y[0]==Y[1]) {
					result_y = Y[0];
				}
				if (Y[0]==Y[2]) {
					result_y = Y[0];
				}
				if (Y[1]==Y[2]) {
					result_y = Y[1];
				}
				
			
		
		
		for (int i = 0; i < Y.length; i++) {
			if (X[i]!=result_x) {
				Last_result_x = X[i];
			}
			if (Y[i]!=result_y) {
				Last_result_y = Y[i];
			}
		}
		System.out.print(Last_result_x+" ");
		System.out.println(Last_result_y);
		
		
		
		
		
	}

}
