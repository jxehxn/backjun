package backjun0108;

import java.util.Iterator;
import java.util.Scanner;

public class Ex_24262 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = manOfPassionCount(n);
		System.out.println(count);
		
		int degree = calculateDegree(count);
        System.out.println(degree);
		
	}
	public static int manOfPassionCount(int n) {
		return n/2;
	}
	private static int calculateDegree(int count) {
        if (count <= 3) {
            return count;
        } else {
            return 4; // 최고차항의 차수가 3보다 크면 4 출력
        }
    }
	
}
