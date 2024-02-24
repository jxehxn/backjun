package backjun0122;

import java.util.Random;
import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N_1 = sc.nextInt();
		int M_1 = sc.nextInt();
		
		int[] num = new int[N_1];
		int[] max = new int[N_1];
		Random rn = new Random();
		
		for (int i=0 ; i < N_1 ; i++) {
			for (int j = 0 ; j < N_1; j++) {
				max[i] = rn.nextInt(M_1);
				if (num[i]==max[j]) {
					j--;
				}
				num[i]=max[j];
			}
		}
		
		for (int j = 0; j < N_1; j++) {
			System.out.println(num[j]);
		}
		System.out.println();
	
	}
	
	
	
}
