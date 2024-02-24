import java.util.Arrays;
import java.util.Scanner;

public class Ex_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Ch_num = {1,1,2,2,2,8};
		int[] Ch_user = new int[6];
		int[] Result = new int[6];
		
		
 		for (int i = 0; i < Ch_num.length; i++) {
			Ch_user[i] = sc.nextInt();
			Result[i] = Ch_num[i] - Ch_user[i];
		}
 		
// 		System.out.println(Arrays.toString(Result));
		
 		for (int i : Result) {
			System.out.print(i+" ");
		}
	}
}
