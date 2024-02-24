import java.util.Iterator;
import java.util.Scanner;

public class Ex0113_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		쿼터(Quarter, $0.25)의 개수    25센트
//		다임(Dime, $0.10)의 개수       10센트
//		니켈(Nickel, $0.05)의 개수      5센트
//		페니(Penny, $0.01)   			1센트ㄴ\
		
//		첫째 줄에 테스트 케이스의 개수 T
		
		Scanner sc  = new Scanner(System.in);
		int num1 =  sc.nextInt();
		
		int[] number = new int[num1];
		int[] result = new int[4];
		
		
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}
		
		for (int i = 0; i < number.length; i++) {
			result[0] = number[i]/25;
			result[1] = (number[i] - result[0]*25)/10;
			result[2] = (number[i]-(result[0]*25)-(result[1]*10))/5;
			result[3] = number[i]-(result[0]*25)-(result[1]*10)-(result[2]*5);
		System.out.print(result[0]+" "+result[1]+" "+result[2]+" "+result[3]);
		System.out.println("");
		}

		
	}

}
