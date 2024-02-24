import java.util.Iterator;
import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

//		int result1 = 0;
		int Number = sc.nextInt();

		for (int i =0; i < Number ; i++) {

			for (int k = 0; k < Number-1-i; k++) {
				System.out.print(" ");									
			}			
			for (int k = Number-1-i; k < Number-1; k++) {
				System.out.print("*");									
			}
			System.out.print("*");
		
			for (int k = Number-1 - i; k < Number-1; k++) {
				System.out.print("*");									
			}
//			for (int k = 0; k < Number-1 - i; k++) {
//				System.out.print(" ");									
//			}			
				System.out.println();
		}

		for (int j = 1; j < Number; j++) {
			
			for (int k = Number-1 - j; k < Number-1; k++) {
				System.out.print(" ");									
			}
			
			for (int k = 0; k < Number-1 - j; k++) {
				System.out.print("*");									
			}
			System.out.print("*");
			for (int k = 0; k < Number-1 - j; k++) {
				System.out.print("*");									
			}
//			for (int k = Number-1 - j; k < Number-1; k++) {
//				System.out.print(" ");									
//			}
			System.out.println();	
		}
		
	}

}
