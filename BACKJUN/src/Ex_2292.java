import java.util.Iterator;
import java.util.Scanner;

public class Ex_2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		int[] result = new int[] 
		int result = 1 ;    //몇 증가 수?
		Scanner sc = new Scanner(System.in); 
		int num  = sc.nextInt();
		int count = 1;

		while (true) {
			if (num==1) {
				System.out.println("1");
				break;
			}
			result = result+6*count;

			if (num <= result && num > result-(6*count)) {
				System.out.println(count+1);
				break;
			}
			count++;
		}

	}
}
