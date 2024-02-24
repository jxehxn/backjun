import java.util.Iterator;
import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N_1 = sc.nextInt();
		int M_1 = sc.nextInt();
		
		int[][] square_a = new int[(N_1)][(M_1)];
		int[][] square_b = new int[(N_1)][(M_1)];
		int[][] square_c = new int[(N_1)][(M_1)];
		
		for (int i = 0; i < N_1; i++) {
			for (int j = 0; j < M_1; j++) {
				square_a[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < N_1; i++) {
			for (int j = 0; j < M_1; j++) {
				square_b[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < N_1; i++) {
			for (int j = 0; j < M_1; j++) {
				square_c[i][j] = square_a[i][j]+square_b[i][j];
				System.out.print(square_c[i][j]+" ");
			}
			System.out.println("");
		}
		
		
	}

}
