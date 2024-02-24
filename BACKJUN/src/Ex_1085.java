import java.util.Arrays;
import java.util.Scanner;

public class Ex_1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int result_1 = Math.abs(x-w);
		int result_2 = Math.abs(y-h);
		int result_3 = x;
		int result_4 = y;
		int[] result = {Math.abs(x-w),Math.abs(y-h),x,y};
		
		
		int number = Arrays.stream(result).min().getAsInt();
		
		System.out.println(number);
		
		
	}

}
