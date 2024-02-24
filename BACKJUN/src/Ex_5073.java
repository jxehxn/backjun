import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ex_5073 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
//		String[] str = new String[];
		
		ArrayList<String> str = new ArrayList<String>();
		
		while (true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			
			if (A+B>C||B+C>A||A+C>B) {
				break;
			}
			if (A == 0 && B == 0 && C == 0) {
				break;
			}
			
			if (A == B && B==C && A == C ) {
				str.add("Equilateral");
			} else if (A == B || B==C || A == C) {
				str.add("Isosceles");
			} else if (A !=B&&B!=C&&A!=C) {
				str.add("Scalene");
			}else {
				str.add("Invalid");
			}
		}
		
		for (int i = 0; i < str.size(); i++) {
			
			System.out.println(str.get(i));
		}

	}

}
